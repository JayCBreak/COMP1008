package week8;

public abstract class Shape {
    private int length, width;

    public abstract double area();

    public abstract int perimeter();

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Shape() {
    }

    public Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public String toString() {
        return String.format("Length=%d, Width=%d", this.length, this.width);
    }
}
