package byaj;

/**
 * Created by student on 6/20/17.
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
    @Min(1)
    private double tranAmount;
    @NotNull
    @Min(1)
    private double tranBalance;
    @NotNull
    @Size(min=2, max=30)
    private String tranReason;

    public int getTranID() {
        return tranID;
    }

    /*public void setTranID(int tranID) {
        this.tranID = tranID;
    }*/
    public double getTranBalance(){
        return tranBalance;
    }
    public double getTranAmount(){
        return tranAmount;
    }
    public void setTranBalance(String tranBalance) {
        this.tranBalance = Double.parseDouble(tranBalance);
    }
    public void setTranAmount(String tranAmount) {
        this.tranAmount = Double.parseDouble(tranAmount);
    }

    public String getTranReason() {
        return tranReason;
    }

    public int getTranAcc() {
        return tranAcc;
    }

    public void setTranReason (String tranReason) {
        this.tranReason = tranReason;
    }
    public void setTranAcc(int tranAcc) {
        this.tranAcc = tranAcc;
    }
}