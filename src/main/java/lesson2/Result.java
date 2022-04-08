package lesson2;

public class Result {

    public static void main(String[] args) {

        System.out.println("Hello fckn world");
        long summa = summa(2, 4);
        System.out.println(summa);
        long othersumma = summa(12, 4);
        System.out.println(othersumma);

        long minusRes = minus(10, 9);
        System.out.println(minusRes);

        long resMulty = multiplyAndSumma(5);
        System.out.println(resMulty);

        long resDivide = divide(40, 2);
        System.out.println(resDivide);

        long resMultyplic = multiplication(40, 232, 490);
        System.out.println(resMultyplic);

        double sqrt = sqrt(40908);
        System.out.println(sqrt);

        long resOM = OmLaw(40, 2);
        System.out.println(resOM);

        long resPow = pow(2, 4);
        System.out.println(resPow);

        long resProcent = procent(50, 20);
        System.out.println(resProcent);

        long resCos = cos(50, 20, 30);
        System.out.println(Math.cos(resCos));
    }


    public static int summa(int arg1, int arg2) {
        int result = arg1 + arg2;
        return result;
    }

    public static int minus(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public static int multiplyAndSumma(int arg1) {
        int result = 3 * arg1 + 15;
        result = result - 38;
        return result;
    }

    public static int divide(int arg1, int arg2) {
        return arg1 / arg2;
    }

    public static int multiplication(int arg1, int arg2,int arg3) {
        int result = arg1 * arg2 * arg3;
        return  result;
    }

    public static double sqrt(double arg1) {
        double one = arg1;
        return Math.sqrt(one);
    }


    public static int pow(int value, int powValue) {
        int result = 1;
        for (int i = 1; i <= powValue; i++) {
            result = result * value;
        }
        return result;
    }

    public static int OmLaw( int arg2, int arg3) {
        int i = arg2;
        int r = arg3;
        int u =   i / r;
        return u;
    }

    public static int procent(int arg1, int arg2) {
        int x = arg1;
        int y = arg2;
        int summ =   x + y;
        return summ / 10;
    }

    public static int cos(int arg1, int arg2, int arg3) {
        Integer a = arg1;
        Integer b = arg2;
        Integer c = arg3;
        int res = b * b + c * c - a * a / 2 * b * c;
        return  res;
    }

}
