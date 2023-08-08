/*********************************************
 * Mini-Exercise 3                           *
 * COMP1008 - Intro to Object Oriented Prog. *
 * July 13th 2023                            *
 * Jacob Chotenovsky                         *
 * 200545482                                 *
 *********************************************/
package MiniExercise3;

public class Computer extends Keyboard implements Button {
    // Instance variables for the computer
    public boolean isPoweredOn = false;

    // Constructor
    public Computer(int numOfKeys, boolean hasNumPad) {
        super(numOfKeys, hasNumPad);
    }

    // Overridden methods
    /**
     * Gets the current power state of the computer
     * @return the current power state of the computer
     */
    @Override
    public boolean state() {
        return isPoweredOn;
    }

    /**
     * Changes the computer from being on to off and vice versa
     */
    @Override
    public void click() {
        isPoweredOn = !isPoweredOn;
    }

    /**
     * pressKey prints the key pressed and the force that it was pressed with
     * @param key Takes the key pressed as a parameter
     * @param force Takes the force that the key was pressed with into consideration
     */
    @Override
    public void pressKey(String key, double force) {
        System.out.printf("Button %s was pushed with '%f' Newtons of force\n", key, force);
    }

    /**
     * releaseKey prints the currently pressed key for the duration it is held for
     * @param key Takes the key pressed as a parameter
     * @param heldFor Takes the duration that the key was held for into consideration
     */
    @Override
    public void releaseKey(String key, int heldFor) {
        for(int i = 0; i <= heldFor; i++) {
            System.out.printf("Pressing Key %s\n", key);
        }
    }
}
