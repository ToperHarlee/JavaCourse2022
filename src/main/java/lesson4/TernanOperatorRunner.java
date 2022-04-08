package lesson4;

public class TernanOperatorRunner {
    public static void main(String[] args) {
        System.out.println(abs(25));
        System.out.println(abs(-13));
    }

    // модуль числа (абсолютное значение числа)
   /* public static int abs (int value) {
        if (value >= 0) {
            return value;
        } else {
            //return Math.abs(value);
            return - 1 * value;
        }
    } */

    // запись через тернарный оператор
    public static int abs(int value) {
        return value >= 0 ? value : - 1 * value;
    }
}
