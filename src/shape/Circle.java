package shape;

import static java.lang.Math.PI;
import static java.lang.Math.pow;


public class Circle implements Figure {
    int r;

    public Circle (int r) {
        this.r = r;
    }

    @Override
    public void calculateArea() {
        double res = PI * (r * r);
        System.out.println("Space of circle: " + res);

    }

    public static double calculateArea(double radius) {
        return PI * pow(radius, 2);
    }

    public static double calculateArea(float diameter) {
        System.out.print("float: ");
        return PI * (pow(diameter, 2) / 4);
    }

    @Override
    public void calculatePerimeter() {
        double res = 2 * PI * r;
        System.out.println("Perimeter of rectangle: " + res);

    }
}
