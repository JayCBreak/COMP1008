package week8;

public class Rectangle extends Shape {
    public Rectangle(){}
    public Rectangle(int l, int w) {
        super(l, w);
    }
    @Override
    public double area() {
        return getLength() * getWidth();
    }

    @Override
    public int perimeter() {
        return 2*(getLength() + getWidth());
    }
}
