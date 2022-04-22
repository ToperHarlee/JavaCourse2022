package Lesson6;

import java.util.Arrays;

public class WordReduceRunner {
    public static void main(String[] args) {
        String[] words = {"big", "hello", "ot", "rabotyag", "zavoda", "ot"};
        System.out.println(Arrays.toString(intersec(words, "ot")));//{"big", "hello", "rabotyag", "zavoda"}
        System.out.println(Arrays.toString(intersec(words, "privet")));//{"big", "hello", "ot", "rabotyag", "zavoda", "ot"}
    }
    //создадим еще один массив где будем убирать определенный элемент

    public static String[] intersec(String[] initialArray, String word) {
        //не добавление в массив новых элементов а его сокращение
        //Arrays.toString() возвращает строковое представление одномерного массива, разделяя элементы запятой
        //int index = Arrays.binarySearch(initialArray, word);//Метод Arrays.binarySearch() возвращает позицию заданного значения. Если искомый элемент не найден, то возвращается - (position + 1), где position - позиция элемента где он МОГ БЫ БЫТЬ
        String[] result = new String[ initialArray.length ];
        System.arraycopy(initialArray, 0, result, 0 , initialArray.length);
        for (int i = 0; i < result.length; i++) {
            if (result[i].equals(word)){//если текущее слово которое соответствует элементу в массиве совпадает с введенным словом(аргументом)
                result[i] = null;
            }
        }
        int maxNotNullIndex = 0;//пройтись по новому массиву и посчитать элементы отличные от null
        for (String str : result) {//The str() function converts the specified value into a string.
            if (str != null){
               maxNotNullIndex++;
            }
        }
        String[] newResult = new String[maxNotNullIndex];
        int counter = 0;
        for (String str : result) {
            if (str != null){
                newResult[counter++] = str;
            }
        }
        return newResult;
    }
}
