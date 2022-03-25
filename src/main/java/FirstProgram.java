public class FirstProgram {

    //int  arg1, arg2; тут можно тк ооп//

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

//        long resPow = pow(2, 3);
//        System.out.println(resPow);

        long resPow = pow(2, 4);
        System.out.println(resPow);

    }

    /**
     * метод складывает 2 аргумента и возвращает результат операции
     * @param arg1
     * @param arg2
     * @return результат сложения 2х чисел
     */

    public static int summa(int arg1, int arg2) {
        //перем для суммы 2х чисел
        //результат вычисл должен быть совместим по типу с агрументом
        /*многострочн*/
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

//    public static int pow(int value, int powValue) {
//        return (int)  Math.pow(value, powValue);
//    }

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


}
