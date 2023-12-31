package week9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Week9 {
    static void example1() {
        Dog dog = new Dog();
        Canine canine = new Dog();
        System.out.println(canine);
        System.out.println(dog);
    }

    static void example2() {
        Paws paws = new Dog();
        double result = paws.dig(2);
    }

    static void example3() {
        System.out.println("hello");
    }
    static Scanner input = new Scanner(System.in);
    static void example4() {
        try {
            System.out.println("Enter an odd number: ");
            int number = input.nextInt();
            if(number % 2 == 0) {
                throw new IllegalArgumentException(number + " is not odd!");
            }
            System.out.println("The number was: " + number);
        }
        catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
        catch (InputMismatchException e) {
            System.err.println("Error! Invalid Number");
        }
    }
    static void example5() throws IllegalArgumentException, InputMismatchException{
        System.out.println("Enter an odd number: ");
        int number = input.nextInt();
        if(number % 2 == 0) {
            throw new IllegalArgumentException(number + " is not odd!");
        }
        System.out.println("The number was: " + number);
    }

    static void example6() {
        try {
            example5();
        }
        catch (InputMismatchException e) {
            System.err.println("Invalid Number");
        }
        catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
    static void example7() throws NumberIsNotOddException, InputMismatchException{
        System.out.println("Enter an odd number: ");
        int number = input.nextInt();
        if(number % 2 == 0) {
            throw new NumberIsNotOddException(number + " is not odd!");
        }
        System.out.println("The number was: " + number);
    }
    static void example8() {
        example7();
    }
    static void example9() {
        double result1 = total("hi");
        double result2 = total("hi", 1, 2f, 31d);

        System.out.println(result1);
        System.out.println(result2);
    }

    /**
     * This method calculates the total characters and/or the sum of numerical values
     * If data type is String, computes # of chars, if int, float, or double, adds numerical value to sum
     * We are only going to accept values +/- 10
     * @throws IllegalArgumentException if data type is not String, Double, Float, or Intager
     * @param values either String, int, float, or double
     * @return total chars and/or sum of numerical values
     */
    static double total(Object ...values) throws IllegalArgumentException{
        double sum = 0;
        for (Object value:values) {
            if (value instanceof String){
                String sValue = (String) value;
                if(sValue.length() > 10)
                    throw new IndexOutOfBoundsException("String value is outside of acceptable range");
                sum += sValue.length();
            } else if (value instanceof Integer) {
                int iValue = (int) value;
                determineIfNumberIsInBounds(iValue);
                sum += iValue;
            } else if (value instanceof Float) {
                float fValue = (float) value;
                determineIfNumberIsInBounds(fValue);
                sum += fValue;
            } else if (value instanceof Double) {
                double dValue = (double) value;
                determineIfNumberIsInBounds(dValue);
                sum += dValue;
            } else {
                throw new IllegalArgumentException(String.format("The data type of %s is not acceptable", value.getClass().getSimpleName()));
            }
        }
        return sum;
    }

    static void determineIfNumberIsInBounds(double value) {
        if (value < -10 || value > 10) {
            throw new IndexOutOfBoundsException(value + " is not within range of -10 and 10");
        }
    }

    public static void main(String[] args) {
        example9();
    }
}
