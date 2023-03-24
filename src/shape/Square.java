package shape;

public class Square extends Quadrangle {

    public Square(int a) {
        this.a = a;

    }

    @Override
    public void calculatePerimeter() {
        int res = 4 * a;
        System.out.println("Perimeter of square" + res);
    }

    @Override
    public int maxLength(int a, int b) {
        return a;
    }
}
