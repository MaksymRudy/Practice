package shape;

public class Main {
    public static void main(String[] args) {
        Figure square = new Square(4);
        square.calculateArea();
        square.calculatePerimeter();
        int maxLength1 = square.maxLength(4, 8);
        System.out.println("square.maxLength: " + maxLength1);


        Figure circle = new Circle(4);
        circle.calculateArea();
        circle.calculatePerimeter();
        int maxLength = circle.maxLength(4, 8);
        System.out.println("circle.maxLength: " + maxLength);

        Figure rectangle = new Rectangle(4, 8);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        double area = Circle.calculateArea(4.0);
        System.out.println("First area: " + area);

        double floatArea = Circle.calculateArea(8.0f);
        System.out.println("Second area: " + floatArea);


    }
}
