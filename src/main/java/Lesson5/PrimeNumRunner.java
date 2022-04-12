package Lesson5;

import java.util.Scanner;

public class PrimeNumRunner {
    public static void main(String[] args) {
        System.out.println("ВВедите число как верхнюю границу расчета простых чисел");
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextInt()){
             scanner.next();
        }
        int limit = scanner.nextInt();
        printPrimeNun(limit);
    }

    public static void printPrimeNun (int threshold) {
        if (threshold <= 2){
            System.out.println("ввести число больше 2");
        }
        for (int i = 2; i < threshold; i++) {
           if (isPrime(i)) {
              System.out.println("Текущее значение " + i + "простое");
           }
        }
    }

    public static boolean isPrime(int value) {
        //находим непростые числа
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
               return false;
            }
        }
        return true;
    }

    public static int div (int arg1, int arg2) {
        if(arg2 == 0) {
            return  - 1;
        }
        return arg1 / arg2;
    }
}
