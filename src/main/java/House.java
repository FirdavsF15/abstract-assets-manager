import java.math.BigDecimal;

public class House {

    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String address, int condition, int squareFoot, int lotSize) {
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
        BigDecimal totalPrice = BigDecimal.ZERO;
        switch(condition){
            case 1 ->{
                BigDecimal conditionCost = new BigDecimal(180.0 * squareFoot);
                totalPrice.add(conditionCost);
            }
            case 2->{
                BigDecimal conditionCost = new BigDecimal(130.0 * squareFoot);
                totalPrice.add(conditionCost);
            }
            case 3->{
                BigDecimal conditionCost = new BigDecimal(90.0 * squareFoot);
                totalPrice.add(conditionCost);
            }
            case 4->{
                BigDecimal conditionCost = new BigDecimal(80.0 * squareFoot);
                totalPrice.add(conditionCost);
            }
        }

        BigDecimal squareFootCost = new BigDecimal(.25 * squareFoot);
        totalPrice.add(squareFootCost);

        return totalPrice;
    }

}
