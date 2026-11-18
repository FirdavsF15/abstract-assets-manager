import java.math.BigDecimal;

public class Cash extends Asset{
    //error: class cash must be declared abstract or implement abstract method getValue()
    private int billsCount;

    public Cash(String description, String dateAcquired, BigDecimal originalCost, int billsCount) {
        super(description, dateAcquired, originalCost);
        this.billsCount = billsCount;
    }

    public int getBillsCount() {
        return billsCount;
    }

    public void setBillsCount(int billsCount) {
        this.billsCount = billsCount;
    }

    public BigDecimal getValue(){
        return getOriginalCost();
    }


}
