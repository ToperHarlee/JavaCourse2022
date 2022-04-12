package Lesson5;

import java.net.SocketOption;
import java.util.Scanner;

public class AdvancedScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        while (!scanner.hasNextInt() || !scanner.hasNextDouble() || scanner.hasNext()) {//проверка на то что вводится число
            String text = scanner.next();
            System.out.println("Введите числовое значение! вместо -----> "+ text);
        }
        int index = scanner.nextInt();
        System.out.println("Введено целое значение " + index);
    }
}

