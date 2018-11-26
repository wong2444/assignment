package week2;

public class Circle extends Shape {
    Point center;
    double x, y;
    double radius;

    public Circle(double a, double b, double r) {
        super("Circle");
        setCenter(a, b);
        setRadius(r);

    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setCenter(double a, double b) {
        center = new Point(a, b);
    }

    public String getCenter() {
        return center.toString();
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "Center=" + getCenter() + "; Radius=" + getRadius();
    }
}
