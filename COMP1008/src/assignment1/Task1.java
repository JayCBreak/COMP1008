/*********************************************
 * Assignment 1 - Task1.java                 *
 * COMP1008 - Intro to Object Oriented Prog. *
 * June 1st 2023                             *
 * Jacob Chotenovsky                         *
 * 200545482                                 *
 *********************************************/
package assignment1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Need a Scanner to read in data from cli
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        // Reading into double to allow for greatest range of numbers with the sacrifice of precision
        double num1 = input.nextDouble();

        // Repeat for the second number
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        // Ask for the user
        System.out.print("Enter an arithmetic operator (+, -, *, /): ");
        // We know we only need 1 character for the operator so we can save space by only using a char datatype
        // Using the input.next().charAt(0) we prevent a buffer overflow.
        char operator = input.next().charAt(0);

        double result;

        // Performing the proper calculations given the current input.
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            result = num1 / num2;
        } else {
            System.out.println("Invalid input");
            return;
        }

        // Outputting the results to the user.
        System.out.println("Result of: " + num1 + " " + operator + " " + num2 + " = " + result);
    }
}