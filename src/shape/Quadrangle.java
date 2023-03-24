package shape;

public abstract class Quadrangle implements Figure {

     protected int a;

     @Override
     public void calculateArea() {
          int aria = a * a;
          System.out.println("Aria: " + aria);
     }
}
