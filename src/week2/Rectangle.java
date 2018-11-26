package week2;

public class Rectangle extends Shape {
    Point topLeft;
    double x, y;
    double length;
    double width;

    public Rectangle(double a, double b, double l, double w) {
        super("Rectangle");
        setTopLeft(a, b);
        setLength(l);
        setWidth(w);
    }

    public void setLength(double l) {
        length = l;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double w) {
        width = w;
    }

    public double getWidth() {
        return width;
    }

    public void setTopLeft(double a, double b) {
        topLeft = new Point(a, b);
    }

    public String getTopLeft() {
        return topLeft.toString();
    }

    public double getArea() {
        return width * length;
    }

    public String toString() {
        return "TopLeft=" + getTopLeft() + "; Length=" + getLength() + "; Width=" + getWidth();
    }
}
