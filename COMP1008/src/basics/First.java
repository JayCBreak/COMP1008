public class First {

    //psvm+tab
    public static void main(String[] args) {
        //sout+tab
        System.out.println("Hello World!");
        String name = "Jacob";
        byte age = 21;
        /*
        * literal values
        *   String
        *   char
        *   int
        *   double
        */
        float temperature = 23.5f;
        double weight = 50.5;
        //souf+tab
        /*
        *       formatting character
        *           % + character for data type
        *               s: string
        *               d: digit (whole number)
        *               f: float (decial number)
        */
        System.out.printf("Hi, My name is %s. I weight %.1f kilograms. It is %.2f degrees Celsius outide today%n", name, weight, temperature);
    }
}
