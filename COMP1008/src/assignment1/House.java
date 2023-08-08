/*********************************************
 * Assignment 1 - House.java                 *
 * COMP1008 - Intro to Object Oriented Prog. *
 * June 1st 2023                             *
 * Jacob Chotenovsky                         *
 * 200545482                                 *
 *********************************************/
package assignment1;

public class House {
    // Of the 4 accessibility levels I chose private, public, and protected.
    // I also chose practical data types like short for the number of rooms and double for the price
    // int rooms, while it works, takes up more space than likely necessary.
    private short numOfRooms;
    public double price;
    protected String location;

    // 1. Default constructor (no parameters)
    public House() {
        this((short) 9, 2.55, "256 Your-Home ST, B4D 4S5, City ON. Canada");
    }

    // 2. Constructor w/ all variables
    /* For some reason this gives an error when used instead of 2:
     * "Recursive constructor invocation"
     *  public House(short rooms, float price, String location) {
     *     this(rooms, price, location);
     *  }
     */
    public House(short rooms, double price, String location) {
        this.numOfRooms = rooms;
        this.price = price;
        this.location = location;
    }


    // 3. Constructor w/ only number of rooms
    public House(short rooms) {
        this(rooms, 2.56, "1008 Computer Lane, S0C0O1, Newmarket ON. Canada");
    }

    // 4. Constructor w/ only price
    public House(double price) {
        this((short) 9, price, "316 Post-Meridiem Cr., K4H0O7, Quebec City QC. Canada");
    }

    // 5. Constructor w/ only location
    public House(String location) {
        this((short) 9, 4.11, location);
    }

    // 6. Constructor w/ rooms and price
    public House(short rooms, double price) {
        this(rooms, price, "6 Constructor AVE., W0W8R0, Orillia ON., Canada");
    }

    // 7. Constructor w/ price and location
    public House(double price, String location) {
        this((short) 9, price, location);
    }

    public short getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(short numOfRooms) {
        this.numOfRooms = numOfRooms;
    }
}