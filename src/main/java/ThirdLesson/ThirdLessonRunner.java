package ThirdLesson;

public class ThirdLessonRunner {
    public static void main(String[] args) {

        long othersumma = summa(12, 4);
        System.out.println("сумма чисел" + othersumma);

        long minusRes = minus(10, 9);
        System.out.println("минус числа от числа" + minusRes);

        long resMulty = multiplyAndSumma(5, 4);
        System.out.println("умножение чисел " + resMulty);

        int operand = 42;
        double resDivide = divide(operand, 7);
        System.out.println("деление чисел " + operand + " и ...  " + resDivide);

        double result = pow(2, 4);
        System.out.println("возведение чисел в степень" + result);

        double module = mod(16, 3);
        System.out.println("остаток от деления " + module);
    }


    private static long summa(int i, int i1) {
        return i + i1;
    }

    private static long minus(int i, int i1) {
        return i - i1;
    }

    private static long multiplyAndSumma(int i, int i1) {
        return i * i1;
    }

    private static double divide(int i, int i1) {//либо указать double вместо int  в аргументах (i)
        return i / (double) i1;
    }

    //деление с остатком
    private static long mod(int i, int i1) {
        return i % i1; // можно использовать для проверки четности нечетности чисел(!)
    }

    //возведение в степень
    private static long pow(int i, int i1) {
        return (long) Math.pow(i, i1);//(long) - явное указание типа возвращаемых данных
    }


}


