package ablazzing.lesson3Primitives;

public class MathOperations {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        // Прибавление
        int sum = x + y;
//        System.out.println(sum);

        // Вычитание
        int diff = x - y;
//        System.out.println(diff);

        //Умножение
        int multiply = x * y;
//        System.out.println(multiply);

//        Деление
        y = 3;
        double divide =(double) x / y;  // приобразование
//        System.out.println(divide);

        // Возведение в степень extension
        int ext = x * x;  // возведение во 2-ю степень. Больше степень из бибилиотеки jdk
//        System.out.println(ext);

        // Прибавление нового значения - Инкремент
        //x++; //x = x + 1;

        // Сокращённая форма записи
//        x += 10;
//        x *= 10;
//        x /= 2;
//        System.out.println(x);

        //Декремент
//        x = x - 1;
//        x --;
//        System.out.println(x);

        // Остаток от деления

        int number = 4;
//        4 - 2 - 2 = 0
//        5 - 2 - 2 = 1    кратно 2-м не является
//        7 - 3 - 3 = 1    кратно 3-м не является
        int modulo = number % 2;
//        System.out.println(modulo);

//        Скобки
        int z = (2 + 2) * 2;
//        System.out.println(z);

        // Создать переменные с ростом (в метрах), весом.
        // Произвести расчёт индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        double height = 2.03;
        int weight = 100;
        double index = weight / (height * height);
        System.out.println(index);



    }
}
