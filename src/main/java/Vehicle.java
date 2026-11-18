import java.math.BigDecimal;
import java.time.LocalDate;

public class Vehicle extends Asset{

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, BigDecimal originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAge(){
        LocalDate now = LocalDate.now();

        return now.getYear() - year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public BigDecimal getValue(){
        BigDecimal totalPrice = getOriginalCost();
        int age = getAge();

        if(age>0 &&age<=3){
            for (int i = 0; i < age; i++) {
                BigDecimal reduceCost = totalPrice.multiply(BigDecimal.valueOf(.03));
                totalPrice = totalPrice.subtract(reduceCost);
            }
        }else if(age>=4 && age<=6){
            for (int i = 0; i < age; i++) {
                BigDecimal reduceCost = totalPrice.multiply(BigDecimal.valueOf(.06));
                totalPrice = totalPrice.subtract(reduceCost);
            }
        }else if(age>=7&&age<=10){
            for (int i = 0; i < age; i++) {
                BigDecimal reduceCost = totalPrice.multiply(BigDecimal.valueOf(.08));
                totalPrice = totalPrice.subtract(reduceCost);
            }
        }else{
            totalPrice = totalPrice.subtract(BigDecimal.valueOf(1000));
        }

        if(odometer>100_000 && !(makeModel.contains("Honda") || makeModel.contains("Toyota"))){
            totalPrice = totalPrice.subtract(totalPrice.multiply(BigDecimal.valueOf(.25)));

        }
        

        return totalPrice;
    }
}
