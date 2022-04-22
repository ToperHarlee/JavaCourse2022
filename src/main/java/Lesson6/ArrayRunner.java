package Lesson6;

import java.util.Arrays;
import java.util.Random;

public class ArrayRunner {
    public static void main(String[] args) {
        char[] symbols = new char[10];
       // symbols[0] = '\u0000';//0
       // printArray(symbols);
        filltArray(symbols);
        System.out.println("------");
        printArray(symbols);
        System.out.println("------");
        System.out.println(indexOf(symbols, 'a'));
        System.out.println(indexOf(symbols, 'h'));
        System.out.println("------");
        System.out.println(String.valueOf(symbols));//приведение к строке
        int [] intArray = new int[100];//0
        boolean[] booleans = new boolean[5];//false
        String[] str = new String[3];//null
        double[] doubleArray = new double[]{0.1, 25.1, 78};
        System.out.println(Arrays.toString(doubleArray));
        String[] strings = {"Privet","Hello"};
        String string = strings[strings.length - 1];//последний элемент в массиве
        System.out.println(string);
        System.out.println(Arrays.toString(strings));
        //String[] weekDays = weekDays();
//        if (weekDays != null) {//если возвращается null
//            System.out.println(weekDays.length);
//        }
        System.out.println(weekDays().length);
    }

    private static void printArray(char[] symbols) {
        //for (int i = 0; i < symbols.length; i++) {
        for (char symbol: symbols){
           // System.out.println(i + symbols[i]);
           System.out.println(  symbol);
        }
    }

    private static void filltArray(char[] symbols) {
        symbols[0] = 'a';
        symbols[1] = 'b';
        symbols[2] = 'c';
        symbols[3] = 'd';
        symbols[4] = 'e';
        symbols[5] = 'f';
        symbols[6] = 'g';
        symbols[7] = 'i';
        symbols[8] = 'j';
        symbols[9] = 'k';
    }

    public  static  int indexOf (char[] symbols, char searchElement) {
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == searchElement) {
                return i;
            }
        }
        return -1;
    }

    public static String[] weekDays() {
        //Math.random()[0, 1]
        Random random = new Random();
//        if (random.nextBoolean()){
//
//        }
        return random.nextBoolean() ? new String[]{"Mon", "tue"} : new String[]{};
    }
}
