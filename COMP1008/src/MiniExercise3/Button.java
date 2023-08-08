/*********************************************
 * Mini-Exercise 3                           *
 * COMP1008 - Intro to Object Oriented Prog. *
 * July 13th 2023                            *
 * Jacob Chotenovsky                         *
 * 200545482                                 *
 *********************************************/
package MiniExercise3;

public interface Button {
    // Two constant values, one for the activation height of the button, another for the duration of button press
    public double ACTIVATION_HEIGHT = 10.69;
    public int MAX_DURATION = 25;

    // Two methods that show what the current state of the button is, and what to do when clicked
    /**
     * Outputs current state
     */
    public boolean state();

    /**
     * Outputs an action for when the button is clicked
     */
    public void click();
}
