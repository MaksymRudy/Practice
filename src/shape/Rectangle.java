package shape;

public class Rectangle extends Quadrangle{
   public int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public void calculateArea() {
        int res = a * b;
        System.out.println("Space of rectangle: " + res);

    }

    @Override
    public void calculatePerimeter() {
        int res = 2 * (a + b);
        System.out.println("Perimeter of rectangle: " + res);

    }
}
