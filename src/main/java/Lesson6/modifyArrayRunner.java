package Lesson6;

import java.util.Arrays;

public class modifyArrayRunner {
    public static void main(String[] args) {
        //массивы задают свою длинну при своем обьявлении
        //для увеличения длинны массива можно копировать массив
        int[] digits = {1, 2,3, 4, 5, 6, 7, 8, 9, 10};
        int[] anotherDigits = new int[digits.length + 1];//клонирование массива
       //int [] anotherDigits = digits;// в этом случае оба массива будут одинаковые
       for (int index = 0; index < anotherDigits.length; index++) {
            anotherDigits[index] = anotherDigits[index] + 10;//новые значения будут начинатся с 10
       }
        System.out.println(Arrays.toString(anotherDigits));
        System.out.println("----------------------------");
        System.out.println(Arrays.toString(digits));
    }

    //скопировать содержимое массива из старого  в новый

}
