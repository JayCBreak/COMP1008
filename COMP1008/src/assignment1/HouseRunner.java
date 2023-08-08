/*********************************************
 * Assignment 1 - HouseRunner.java           *
 * COMP1008 - Intro to Object Oriented Prog. *
 * June 1st 2023                             *
 * Jacob Chotenovsky                         *
 * 200545482                                 *
 *********************************************/
package assignment1;

import java.text.DecimalFormat;

public class HouseRunner {
    public static void main(String[] args) {
        // First object uses default constructor.
        House house1 = new House();

        // Second object used the 3rd constructor needing to specify (short) for the rooms to save space.
        House house2 = new House((short)128);

        // Final object used the 7th constructor.
        House house3 = new House(411000000000.99, "1600 Amphitheatre Parkway, Mountain View, CA 94043, USA");

        // Print statements for the 3 objects, using a getter for the number of rooms
        // Using a decimal format for the pricing
        DecimalFormat df = new DecimalFormat("#.##");
        // If print() works like it does in C then there's a lot I could do to format this output even better, but I'm lazy
        System.out.println("House1 - Rooms: " +house1.getNumOfRooms()+ " Price: $" +df.format(house1.price)+ " Location: " +house1.location);
        System.out.println("House2 - Rooms: " +house2.getNumOfRooms()+ " Price: $" +df.format(house2.price)+ " Location: " +house2.location);
        System.out.println("House3 - Rooms: " +house3.getNumOfRooms()+ " Price: $" +df.format(house3.price)+ " Location: " +house3.location);
    }
}
