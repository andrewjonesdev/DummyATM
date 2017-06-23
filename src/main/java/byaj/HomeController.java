package byaj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.math.BigDecimal;
import java.security.Principal;
import java.text.DecimalFormat;
import java.text.ParseException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * Created by student on 6/20/17.
 */
@Controller
public class HomeController {
    @Autowired
    private TransactionATMRepository transactionATMRepository;

    @Autowired
    private AccountRepository accountRepository;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/")
    public String newTransactionATM(Model tranModel, Model accModel, Principal principal){
        accModel.addAttribute("account", accountRepository.findOneByAccNumber(principal.getName()));
        tranModel.addAttribute("transactionATM", new TransactionATM());
        return "form";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }


    @GetMapping("/add")
    public String getRooms(Model model){
        model.addAttribute(new TransactionATM());
        model.addAttribute("items", transactionATMRepository.findAll());
        return "result";
    }

    @GetMapping("/account")
    public String getReddit(Model model, Principal principal){

        model.addAttribute("items", transactionATMRepository.findAllByTranAccOrderByTranDateDesc(Integer.parseInt(principal.getName())));
        return "byaccount";
    }

    @PostMapping("/add")
    public String processTransaction(@Valid TransactionATM transactionATM, BindingResult bindingResult, Account account, Principal principal) {
        if (bindingResult.hasErrors()) {
            System.out.println("two");
            return "redirect:/";
        }
        DecimalFormat format = new DecimalFormat();
        format.setParseBigDecimal(true);
        transactionATM.setTranAcc(Integer.parseInt(accountRepository.findOneByAccNumber(principal.getName()).getAccNumber()));
        transactionATM.setTranBalance(accountRepository.findOneByAccNumber(principal.getName()).getAccBalance());

        if (transactionATM.getTranAction().toLowerCase().equals("withdrawal") || transactionATM.getTranAction().toLowerCase().equals("withdraw")) {
            if (transactionATM.getTranAmount().doubleValue() < 0) {
                System.out.println("three");
                return "redirect:/";
            }
            transactionATM.setTranBalance(transactionATM.getTranBalance().subtract(transactionATM.getTranAmount()));
            if (transactionATM.getTranBalance().doubleValue() < 0) {
                System.out.println("four");
                return "redirect:/";
            }
        } else if (transactionATM.getTranAction().toLowerCase().equals("deposit")) {
            if (transactionATM.getTranAmount().doubleValue() < 0) {
                System.out.println("five");
                return "redirect:/";
            }
            transactionATM.setTranBalance(transactionATM.getTranBalance().add(transactionATM.getTranAmount()));
            if (transactionATM.getTranBalance().doubleValue() < 0) {
                System.out.println("six");
                return "redirect:/";
            }
        }
            accountRepository.save(account);
            transactionATMRepository.save(transactionATM);
            return "redirect:/account";

    }


}
