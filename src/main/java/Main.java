import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        //Asset newAsset = new Asset("berries", 2020, 150.50);

        // Example 1: A newer, well-maintained house
        House myHouse = new House(
                "My Main Residence",      // description
                "2021-05-15",          // dateAcquired
                new BigDecimal("450000"), // originalCost
                "123 Maple Street",    // address
                1,                   // condition (1 = excellent)
                2200,              // squareFoot
                6000               // lotSize
        );

// Example 2: An older house in fair condition
        House vacationHome = new House(
                "Vacation Cabin",        // description
                "2010-07-20",          // dateAcquired
                new BigDecimal("180000"), // originalCost
                "456 Lakeview Road",   // address
                3,                   // condition (3 = fair)
                1400,              // squareFoot
                12000              // lotSize
        );

        assets.add(myHouse);
        assets.add(vacationHome);

        // Example 1: A relatively new car
        Vehicle myCar = new Vehicle(
                "My Daily Driver",       // description
                "2022-03-10",          // dateAcquired
                new BigDecimal("28000"), // originalCost
                "Toyota Camry",        // makeModel
                2022,                // year
                17000              // odometer
        );

// Example 2: An older truck
        Vehicle workTruck = new Vehicle(
                "Work Truck",          // description
                "2015-08-22",          // dateAcquired
                new BigDecimal("35000"), // originalCost
                "Ford F-150",        // makeModel
                2015,                // year
                112000              // odometer
        );

        assets.add(myCar);
        assets.add(workTruck);

        for(Asset a: assets){
            String message = "";
            if (a instanceof House) {
                House house = (House) a;
                message = "House at " + house.getAddress() +"\n Value is: $" + house.getValue();
                System.out.println(message);
            } else if (a instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) a;
                message = "Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel()+"\n Value is: $" + vehicle.getValue();
                System.out.println(message);
            }
        }





    }


}
