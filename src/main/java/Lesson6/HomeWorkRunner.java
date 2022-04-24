package Lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkRunner {
    public static void main(String[] args) {
        //вычислить max min и среднее значение в массивах тремя способами
        // заполнить массив случайными числами Math.random
        //длинна массива запрашивается у пользователя
        int arrayLenght = getArrayLenght();//заданная длинна массива в переменную чтобы использовать в других методах
        int[] array = fiillRandomArr(arrayLenght);//сделать возвращаемый массив переменной
        System.out.println(Arrays.toString(array));
        int max = getMaxEl(array);
        System.out.println("максимум в заданном массиве  " + max);
        int min = getMinEl(array);
        System.out.println("минимум в заданном массиве " + min);
        System.out.println("-------------------------");
        int maxTwo = getMaxAnothMethod(array);
        System.out.println("максимум в заданном массиве  " + maxTwo);
        int minTwo = getAnotherMinEl(array);
        System.out.println("минимум в заданном массиве " + minTwo);

//        double avg = 0;
//        for (int digit: array) {
//            avg += digit;
//        }
//        avg /= arrayLenght;
//        System.out.println("среднее значение  " + avg);
        int avgVal = getEvgEl(array);
        System.out.println("среднее значение  " + avgVal);
        double avgValTwo = getAvgTwo(array);
        System.out.println("среднее значение  " + avgValTwo);
    }

    private static int getMaxEl(int[] array) {
        int maxVal = array[0];
        for (int digit: array){
            if (digit > maxVal){
                maxVal = digit;//если рассм элемент больше текущего максимума то мах становитс это число
            }
        }
        return maxVal;
    }

    private static int getMaxAnothMethod(int[] array) {
        int maxVal = array[0];
        for (int digit: array){
            maxVal = Math.max(maxVal, digit);
        }
        return maxVal;
    }

    private static int getMinEl(int[] array) {
        int minVal = array[0];
        for (int num: array){
            if (num < minVal){
                minVal = num;//если рассм элемент больше текущего минимума то мин становится текущее число
            }
        }
        return minVal;
    }

    private static int getAnotherMinEl(int[] array) {
        int minValTwo = array[array.length - 1];//последний элемент в массиве
        if (array.length > 1){
            for (int ind = array.length - 2; ind >= 0; ind--){
                int num = array[ind];
                if (num < minValTwo) {
                    minValTwo = num;
                }
            }
        }
        return minValTwo;
    }

    //среднее значение
    //avg сумма всех элементов / на количество элементов в массиве
    private static int getEvgEl(int[] array) {
        int avgVal = array[0];
        int avg = 0;
        for (int digit: array) {
            avg += digit;
        }
        avg /= avgVal;
        return avg;
    }

    private static double getAvgTwo(int[] array) {//в качестве аргумента arrayLenght тип колобэк
        double avg = 0;
        for (int digit: array) {
            avg += digit;
        }
        avg /= array.length;
        return avg;
    }


    //trl + alt + n --> videlenie ,etoda
    private static int[] fiillRandomArr(int arrayLenght) {//как аргумент передать метод где задается длинна
        int[] randArr = new int[arrayLenght];
        for (int i = 0; i < randArr.length; i++ ){
            randArr[i] =(int ) Math.round(Math.random() * 1000); // ot 0 do 1
        }
        return randArr;
    }

    private static int getArrayLenght() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        while (!scanner.hasNextInt() || !scanner.hasNextDouble()) {//проверка на то что вводится число
            String text = scanner.next();
            System.out.println("Введите числовое значение! " + text);
        }
        int lengthArrRes = scanner.nextInt();//проверка на то что введено например не -2
        while (lengthArrRes <= 0) {
            System.out.println("указанное значение некорректно");
            return getArrayLenght();//рекурсия кода
        }
        return lengthArrRes;
        //scanner длинна массива будет
        //int arrayLenght = scanner.nextInt();//число введенное пользователем будет длинной массива
    }

//    private static void randomArray() {
//        int[] arr = new int[];
//        for (int i = 0; i < arr.length; i++ ){
//            arr[i] = (int) Math.random() * 10;
//        }
//    }
}
