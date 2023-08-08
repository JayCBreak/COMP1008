/*********************************************
 * Mini-Exercise 2                           *
 * COMP1008 - Intro to Object Oriented Prog. *
 * June 17th 2023                            *
 * Jacob Chotenovsky                         *
 * 200545482                                 *
 *********************************************/
package MiniExercise2;

public class Vehicle {
    // Instance Vars:
    // String is the best data type for colour as that allows for the greatest flexibility in colour name choice
    // Int is the best data type for the number of doors as no decimal places are needed so float is bad, and byte is too short
    // Boolean is the best data type for determining gas power because it can only either be or not be gas powered (2 states)
    private String colour;
    public int numDoors;
    protected boolean isGasPowered;

    // Default Constructor
    // Set to the average car on the road today
    public Vehicle() {
        this.colour = "Blue";
        this.numDoors = 4;
        this.isGasPowered = true;
    }

    // 1. Constructor w/ all Parameters
    public Vehicle(String colour, int numDoors, boolean isGasPowered) {
        this.colour = colour;
        this.numDoors = numDoors;
        this.isGasPowered = isGasPowered;
    }

    // 2. Constructor w/ 2 Parameters
    // Chose colour and gas powered because most cars have 4 doors
    public Vehicle(String colour, boolean isGasPowered) {
        this.colour = colour;
        this.numDoors = 4;
        this.isGasPowered = isGasPowered;
    }

    // 3. Constructor w/ 2 Parameters
    // Chose colour and number of doors because most cars burn gas
    public Vehicle(String colour, int numDoors) {
        this.colour = colour;
        this.numDoors = numDoors;
        this.isGasPowered = true;
    }

    // 4. Constructor w/ 1 Parameter
    // Chose colour since that is what most people care about customizing... At least I think
    public Vehicle(String colour) {
        this.colour = colour;
        this.numDoors = 4;
        this.isGasPowered = true;
    }

    // Create the necessary getters and setters for this class
    // Taking these instructions literally the only one that is necessary is the vehicle's colour
    // Doors and Gas are public and protected which allows them to be modified outside of this class.
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    // Override the toString method to create a summary of the vehicle
    @Override
    public String toString() {
        return "Vehicle{ colour: " + this.colour + ", Number of Doors: " + this.numDoors +
                ", Gas Powered: " + this.isGasPowered + " }";
    }

    // Create a isEcoFriendly method w/out parameters that determines if the vehicle is 2 door and not gas powered
    // Using a single return statement to make this
    public boolean isEcoFriendly() {
        return this.numDoors == 2 && !this.isGasPowered;
    }
}
