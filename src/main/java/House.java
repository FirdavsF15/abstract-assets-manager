import java.math.BigDecimal;

public class House extends Asset{

    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;


    public House(String description, String dateAcquired, BigDecimal originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public BigDecimal getValue(){
        BigDecimal totalPrice = BigDecimal.valueOf(0);
        switch(condition){
            case 1 ->{
                BigDecimal conditionCost = BigDecimal.valueOf(180).multiply(BigDecimal.valueOf(squareFoot));
                totalPrice =totalPrice.add(conditionCost);
            }
            case 2->{
                BigDecimal conditionCost = BigDecimal.valueOf(130).multiply(BigDecimal.valueOf(squareFoot));
                totalPrice =totalPrice.add(conditionCost);
            }
            case 3->{
                BigDecimal conditionCost = BigDecimal.valueOf(90).multiply(BigDecimal.valueOf(squareFoot));
                totalPrice =totalPrice.add(conditionCost);
            }
            case 4->{
                BigDecimal conditionCost = BigDecimal.valueOf(80).multiply(BigDecimal.valueOf(squareFoot));
                totalPrice =totalPrice.add(conditionCost);
            }
        }

        BigDecimal lotCost = BigDecimal.valueOf(0.25).multiply(BigDecimal.valueOf(lotSize));
        totalPrice = totalPrice.add(lotCost);

        return totalPrice;
    }

}
