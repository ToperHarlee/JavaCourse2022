package Lesson6;

import java.util.Arrays;

public class copyArrayRunner {
    public static void main(String[] args) {
        String[] words = {"Mama", "mila", "ramu"};
        String[] anotherWords = copyArray(words);
        anotherWords[words.length ] = "end";
        System.out.println(Arrays.toString(anotherWords));
        String[] newArrays = Arrays.copyOf(anotherWords, (int) Math.round(anotherWords.length * 1.5));
        System.out.println(Arrays.toString(newArrays));
        System.out.println("-------------------------");
        String[] effectiveArray = new String[100];
        int firstIndex = 0;
        System.arraycopy(words, firstIndex, effectiveArray,0, words.length - firstIndex);
        System.out.println(Arrays.toString(effectiveArray));
    }

    public static String[] copyArray(String[] words){
        String[] newArray = new String[(int) Math.round(words.length * 1.5)];
        for (int i = 0; i < words.length; i++) {
            newArray[i] = words[i];// заполняем новый массив элментами старого
        }
        return  newArray;
    }
}
