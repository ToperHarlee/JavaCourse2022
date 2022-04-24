package Lesson6;

import java.util.Scanner;

public class FibonacyArrRunnerHomWorkpartTwo {
    public static void main(String[] args) {
        int arrayLenght = 50;
        long[] fibonaccyArr = new long[arrayLenght];
        fibonaccyArr[0] = 1;
        fibonaccyArr[1] = 1;
        System.out.println("Privet user");
        int index;
        int lastIndex = 2;
        while (true){
            index = getFibonaciIndex(arrayLenght);//значение введеное больше 0 и не null //  1 1 2 3 4 8 13 21 34 55 89 144...
            //System.out.println(index);
            long result;
            if (fibonaccyArr[index] == 0) {
                fillFibonaccyArr(fibonaccyArr, index, lastIndex);
                //result =  fibonaccyArr[index];
            }
//            else {
//               result = fibonaccyArr[index];
//            }
            result = fibonaccyArr[index];
            System.out.println("Число стоящее на \\%d индексе имеет значение \\%d " + index + result );
        }
    }

    private static void fillFibonaccyArr(long[] fibonaccyArr, int index, int lastIndex) {
        System.out.println("Значение с индексом \\%d было рассчитано и помещено в кэш" + index);
        for (int i = lastIndex; i <= index; i++){
           fibonaccyArr[i] = fibonaccyArr[i - 1] + fibonaccyArr[i -2];
        }
    }

    private static int getFibonaciIndex(int maxindex) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите позицию в ряде Фибоначчи как целое число");
        while (!scanner.hasNextInt() || !scanner.hasNextDouble()) {//проверка на то что вводится число

            String text = scanner.next();
            if ("exit".equalsIgnoreCase(text)){
                System.out.println("вы вышли из программы");
                System.exit(0);
            }
            System.out.println("Введите числовое значение! " + text);
        }
        int lengthFib = scanner.nextInt();//проверка на то что введено например не -2
        if (lengthFib < 0) {
            System.out.println("указанное значение некорректно");
            return getFibonaciIndex(maxindex);//рекурсия кода
        } else if (lengthFib >= maxindex ) {//ограничение для пользователя
            System.out.println("указанное значение выше допустимого (50)");
            return getFibonaciIndex(maxindex);
        }
        return lengthFib;

    }
}
