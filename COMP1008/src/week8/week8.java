package week8;

public class week8 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());

        Rectangle r2 = new Rectangle(5, 10);
        System.out.println(r2);
        System.out.println(r2.area());
        System.out.println(r2.perimeter());

        System.out.println("*".repeat(20));

        Shape s1 = new Rectangle(3, 5);
        System.out.println(s1);
        System.out.println(s1.area());
        System.out.println(s1.perimeter());
    }
}


/* 
 Polymorphism
 Poly           Many
 Morphism       forms

 Override       new implementation
 Overload       new variation (constructor)

 Abstract
        Class
        Method
 Interface
        entity

 Abstraction: separation of things to make easier to manage. when brought together, makes something whole
 Encapsulation: hiding
 
 
 */