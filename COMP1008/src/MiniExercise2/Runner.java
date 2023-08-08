/*********************************************
 * Mini-Exercise 2                           *
 * COMP1008 - Intro to Object Oriented Prog. *
 * June 17th 2023                            *
 * Jacob Chotenovsky                         *
 * 200545482                                 *
 *********************************************/

// Unsure if you wanted us to submit a Runner of our own or just recommended making our own for testing
// Here is mine anyways

package MiniExercise2;

public class Runner {
    public static void main(String[] args) {
        // Setup all 5 constructors for Vehicle class
        // Using an array for easy for loops later
        Vehicle[] cars = new Vehicle[5];
        cars[0] = new Vehicle();
        cars[1] = new Vehicle("Bright Green", 2, false);
        cars[2] = new Vehicle("Yellow", false);
        cars[3] = new Vehicle("Purple", 42);
        cars[4] = new Vehicle("Pink");

        // Check that each vehicle is created correctly
        for (Vehicle car:cars) {
            System.out.println(car.toString());
        }
        // Check if isEcoFriendly() method is working correctly
        for (Vehicle car:cars) {
            System.out.println(car.isEcoFriendly());
        }
        // Check if I can set vars
        for (Vehicle car:cars) {
            car.isGasPowered = false;
            car.numDoors = 69;
            car.setColour("Hot Pink");
            System.out.println(car.toString());
        }


        // Setup all 8 constructors for Truck class
        Truck[] trucks = new Truck[8];
        trucks[0] = new Truck();
        trucks[1] = new Truck("Black", (short) 4, false);
        trucks[2] = new Truck("Green", true);
        trucks[3] = new Truck("Red", (short) 3);
        trucks[4] = new Truck("Turquoise");
        trucks[5] = new Truck("Blue", 4, false, (short) 1);
        trucks[6] = new Truck("Yellow", 6, true, 0.0);
        trucks[7] = new Truck("Pink", 2, false, (short) 2, 0.0);

        // Check that each truck is created correctly
        for (Truck truck:trucks) {
            System.out.println(truck.toString());
        }
        // Check if isEcoFriendly() method is working correctly
        for (Truck truck:trucks) {
            System.out.println(truck.isEcoFriendly());
        }
        // Check if I can set vars
        for (Truck truck:trucks) {
            truck.isGasPowered = false;
            truck.numDoors = 69;
            truck.setColour("Hot Pink");
            truck.seats = 2;
            truck.trunkSpace = 1.2;
            System.out.println(truck.toString());
        }
    }
}
