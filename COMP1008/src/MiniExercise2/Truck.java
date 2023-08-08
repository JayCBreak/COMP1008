/*********************************************
 * Mini-Exercise 2                           *
 * COMP1008 - Intro to Object Oriented Prog. *
 * June 17th 2023                            *
 * Jacob Chotenovsky                         *
 * 200545482                                 *
 *********************************************/
package MiniExercise2;

public class Truck extends Vehicle {
    // Instance Vars:
    // short is the best for seats because float has unnecessary decimal points and byte is too small
    // Trucks also often have fewer seats than a normal vehicle
    // double is the best for trunkSpace because the space is a volume and therefore needs precision
    public short seats;
    protected double trunkSpace;

    // 1. Default Constructor
    // Using super to inherit/setup Vehicle before extending with Truck
    public Truck() {
        super();
        this.seats = 2;
        this.trunkSpace = 256.0;
    }
    // 2. Mirror Constructor w/ all Parameters
    public Truck(String colour, short numDoors, boolean isGasPowered) {
        super(colour, numDoors, isGasPowered);
        this.seats = 2;
        this.trunkSpace = 256.0;
    }
    // 3. Mirror Constructor w/ 2 Parameters
    // Chose colour and gas powered because most cars have 4 doors
    public Truck(String colour, boolean isGasPowered) {
        super(colour, isGasPowered);
        this.seats = 2;
        this.trunkSpace = 256.0;
    }
    // 4. Mirror Constructor w/ 2 Parameters
    // Chose colour and number of doors because most cars burn gas
    public Truck(String colour, short numDoors) {
        super(colour, numDoors);
        this.seats = 2;
        this.trunkSpace = 256.0;
    }
    // 5. Mirror Constructor w/ 1 Parameter
    // Chose colour since that is what most people care about customizing... At least I think
    public Truck(String colour) {
        super(colour);
        this.seats = 2;
        this.trunkSpace = 256.0;
    }
    // 6. Constructor with 3 instance vars for Vehicle & the seats
    public Truck(String colour, int numDoors, boolean isGasPowered, short seats) {
        super(colour, numDoors, isGasPowered);
        this.seats = seats;
        this.trunkSpace = 256.0;
    }
    // 7. Constructor with 3 instance vars for Vehicle & the trunk space
    public Truck(String colour, int numDoors, boolean isGasPowered, double trunkSpace) {
        super(colour, numDoors, isGasPowered);
        this.seats = 2;
        this.trunkSpace = trunkSpace;
    }
    // 8. Constructor with 3 instance vars for Vehicle & both the seats and trunk space
    public Truck(String colour, int numDoors, boolean isGasPowered, short seats, double trunkSpace) {
        super(colour, numDoors, isGasPowered);
        this.seats = seats;
        this.trunkSpace = trunkSpace;
    }

    // Override the toString method to summarize the instance vars of the Truck class
    @Override
    public String toString() {
        return "Truck{ colour: " + this.getColour() + ", Number of Doors: " + this.numDoors +
                ", Gas Powered: " + this.isGasPowered + ", Seats: " + this.seats + ", Trunk Space: " +
                this.trunkSpace + " }";
    }
    // Override the isEcoFriendly from the Vehicle class to also determine if the truck has at most 2 seats and no trunk
    @Override
    public boolean isEcoFriendly() {
        return (this.numDoors == 2 && !this.isGasPowered) || (this.seats <= 2 && this.trunkSpace == 0.0);
    }
}
