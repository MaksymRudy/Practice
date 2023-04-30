package ablazzing.lesson3Primitives;

public class Primitives {
    public static void main(String[] args) {
        // логические значения (булевые значения)
        // истина -> true -> yes -> 1
        boolean answerYuri = true;
        // Ложь -> false -> no -> 0
        boolean answerPetr = false;


        // целые числа
        // Byte - байт
        byte maxByte = 127;
        byte minByte = -128;

        // Short - короткое число, состоит из двух байт или из 16 битов
        short maxShort = 32_767;
        short minShort = -32_768;

        // Integer - целое число, которое состоит из  4 байт или 32 битов
        int maxInteger = 2_147_483_647;
        int minInteger = -2_147_483_648;

        // Long  - целое число, которое состоит из 8 байт или 64 битов
        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9_223_372_036_854_775_808L;

        // Double - число с плавающей точкой, 64 бит
        double myBottle = 1.5;

        // Float - число с плавающей точкой, 32 бит
        float cola = 0.33F;

        double doubleNumber = 1.1234567890123467890;
        float floatNumber = 1.1234567890123467890F;
        System.out.println(doubleNumber);
        System.out.println(floatNumber);

    }
}
