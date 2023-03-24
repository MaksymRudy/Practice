package shape;

public interface Figure {
   void calculateArea();

    void  calculatePerimeter();

    default int maxLength (int a, int b) {
        return a >= b ? a: b;  // тернарний оператор
    }
}
