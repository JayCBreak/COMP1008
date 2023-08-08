/*********************************************
 * Mini-Exercise 3                           *
 * COMP1008 - Intro to Object Oriented Prog. *
 * July 13th 2023                            *
 * Jacob Chotenovsky                         *
 * 200545482                                 *
 *********************************************/
package MiniExercise3;

public abstract class Keyboard {
    // 2 Instance Variables for the number of keys on the keyboard and if the keyboard has a number pad
    private int numOfKeys = 255;
    protected boolean hasNumPad = true;

    // 2 Constructors - Default constructor and a constructor for setting both variables
    public Keyboard() {
        setNumOfKeys(104);
        setHasNumPad(false);
    }
    public Keyboard(int numOfKeys, boolean hasNumPad) {
        setNumOfKeys(numOfKeys);
        setHasNumPad(hasNumPad);
    }

    // 4 Concrete Methods - Getters and Setters for the 2 variables
    public int getNumOfKeys() {
        return numOfKeys;
    }

    public void setNumOfKeys(int numOfKeys) {
        this.numOfKeys = numOfKeys;
    }

    public boolean isHasNumPad() {
        return hasNumPad;
    }

    public void setHasNumPad(boolean hasNumPad) {
        this.hasNumPad = hasNumPad;
    }

    // 2 Abstract Methods - One for when a key is pressed with force, and another for when it's released after a duration
    public abstract void pressKey(String key, double force);
    public abstract void releaseKey(String key, int heldFor);
}
