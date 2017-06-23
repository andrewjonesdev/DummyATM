package byaj;

/**
 * Created by student on 6/20/17.
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@Entity
public class TransactionATM {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@NotNull
    //@Min(1)
    private int tranID;
    @NotNull
    @Min(1)
    private int tranAcc = 5;
    @NotNull
    @DecimalMin(value="0.0", inclusive=false)
    private BigDecimal tranAmount;
    @NotNull
    @DecimalMin(value="0.0", inclusive=true)
    private BigDecimal tranBalance=BigDecimal.valueOf(5.0);
    @NotNull
    @Size(min=2, max=30)
    private String tranAction;
    @NotNull
    @Size(min=2, max=200)
    private String tranReason;
    private Date tranDate=new Date();
    
    public int getTranID() {
        return tranID;
    }

    /*public void setTranID(int tranID) {
        this.tranID = tranID;
    }*/
    public BigDecimal getTranBalance(){
        return tranBalance;
    }
    public BigDecimal getTranAmount(){
        return tranAmount;
    }
    public void setTranBalance(BigDecimal tranBalance) {
        this.tranBalance = tranBalance;
    }
    public void setTranAmount(BigDecimal tranAmount) {
        this.tranAmount = tranAmount;
    }
    public String getTranAction() {
        return tranAction;
    }
    public String getTranReason() {
        return tranReason;
    }

    public int getTranAcc() {
        return tranAcc;
    }
    public void setTranAction (String tranAction) {
        this.tranAction = tranAction;
    }
    public void setTranReason (String tranReason) {
        this.tranReason = tranReason;
    }
    public void setTranAcc(int tranAcc) {
        this.tranAcc = tranAcc;
    }
    public Date getTranDate() {
        return tranDate;
    }


    public String getFormatDate(){
        SimpleDateFormat format = new SimpleDateFormat("EEEE MMMMM dd, yyyy hh:mm a zzzz", Locale.US);
        return format.format(tranDate);
    }
}