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

@Entity
public class TransactionATM {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@NotNull
    //@Min(1)
    private int tranID;
    @NotNull
    @Min(1)
    private int tranAcc;
    @NotNull
    @DecimalMin(value="0.0", inclusive=false)
    private BigDecimal tranAmount;
    @NotNull
    @DecimalMin(value="0.0", inclusive=false)
    private BigDecimal tranBalance;
    @NotNull
    @Size(min=2, max=30)
    private String tranAction;
    @NotNull
    @Size(min=2, max=200)
    private String tranReason;

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
    public void setTranBalance(String tranBalance) {
        this.tranBalance = new BigDecimal(tranBalance);
    }
    public void setTranAmount(String tranAmount) {
        this.tranAmount = new BigDecimal(tranAmount);
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
}