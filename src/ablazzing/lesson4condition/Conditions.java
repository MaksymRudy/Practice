package ablazzing.lesson4condition;

// Условные конструкции урок 17

public class Conditions {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
// Задача если х больше чем у - вывести на экран х больше у. Иначе ничего не делать.
        if (x > y) {
            System.out.println(" X more than Y");
        } else if (x == y) {
            System.out.println("X similar Y");
        } else {
            System.out.println("Y more X");
        }
    }
}
