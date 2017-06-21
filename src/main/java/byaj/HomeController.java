package byaj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by student on 6/20/17.
 */
@Controller
public class HomeController {
    @Autowired
    private TransactionATMRepository transactionATMRepository;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/")
    public String newTransactionATM(Model model){
        model.addAttribute("transactionATM", new TransactionATM());
        return "form";
    }
    @PostMapping("/add")
    public String processTransaction(@Valid TransactionATM transactionATM, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "form";
        }

        if(transactionATM.getTranReason().toLowerCase().equals("withdrawal")||transactionATM.getTranReason().toLowerCase().equals("withdraw")){
            if(transactionATM.getTranAmount().doubleValue()<0){
                return "form";
            }
            transactionATM.setTranBalance(Double.toString(transactionATM.getTranBalance().doubleValue()-transactionATM.getTranAmount().doubleValue()));
            if(transactionATM.getTranBalance().doubleValue()<0){
                return "form";
            }
        }
        else if(transactionATM.getTranReason().toLowerCase().equals("deposit")){
            if(transactionATM.getTranAmount().doubleValue()<0){
                return "form";
            }
            transactionATM.setTranBalance(Double.toString(transactionATM.getTranBalance().doubleValue()+transactionATM.getTranAmount().doubleValue()));

        }
        else{
            return "form";
        }
        transactionATMRepository.save(transactionATM);
        return "result";
    }
}
