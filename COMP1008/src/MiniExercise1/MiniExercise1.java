/*********************************************
 * Mini-Exercise 1                           *
 * COMP1008 - Intro to Object Oriented Prog. *
 * May 27th 2023                             *
 * Jacob Chotenovsky                         *
 * 200545482                                 *
 *********************************************/

import java.util.Scanner;
import java.util.Random;

public class MiniExercise1 {
    public static void main(String[] args) {
        Task1();
        Task2();
    }

    public static void Task1() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many elements would you like to create? ");
        int numElements = input.nextInt();

        Object[] objArray = new Object[numElements];

        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter a value for element " + (i+1) + ": ");
            String userVal = input.next();

            if (userVal.equals("0") || userVal.equals("1")) {
                objArray[i] = userVal.equals("1");
            } else if (Long.parseLong(userVal) >= Byte.MIN_VALUE && Long.parseLong(userVal) <= Byte.MAX_VALUE) {
                objArray[i] = Byte.parseByte(userVal);
            } else if (Long.parseLong(userVal) >= Short.MIN_VALUE && Long.parseLong(userVal) <= Short.MAX_VALUE) {
                objArray[i] = Short.parseShort(userVal);
            } else {
                objArray[i] = Integer.parseInt(userVal);
            }
        }

        for (int i = 0; i < numElements; i++) {
            System.out.println("Element " + (i+1) + " using type: " + objArray[i].getClass() + " has value: " + objArray[i]);
        }
    }

    public static void Task2() {
        int[][] multiplicationTable = new int[10][10];

        // populate multiplication table
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                multiplicationTable[i][j] = (i+1)*(j+1);
            }
        }

        Scanner input = new Scanner(System.in);
        System.out.print("How many questions would you like to answer? ");
        int numQuestions = input.nextInt();

        int correct = 0;
        Random rand = new Random();
        for(int i = 0; i < numQuestions; i++) {
            int index1 = rand.nextInt(10);
            int index2 = rand.nextInt(10);
            int expected = multiplicationTable[index1][index2];
            System.out.printf("What is %d x %d ?\n", index1+1, index2+1);
            System.out.printf("\tThe index %d was selected at random in the first dimension of the 2D array.\n", index1);
            System.out.printf("\tThe index %d was selected at random in the second dimension of the 2D array.\n", index2);

            int userAnswer = input.nextInt();
            if(userAnswer == expected) {
                System.out.println("Congratulations! That's correct.");
                correct++;
            } else {
                System.out.printf("Sorry, the correct answer is %d.\n", expected);
            }
        }

        double percentage = ((double)correct / numQuestions) * 100;
        System.out.printf("You answered %d out of %d. That's a percentage of %.0f%%\n", correct, numQuestions, percentage);
    }
}