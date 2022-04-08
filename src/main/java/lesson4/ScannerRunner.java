package lesson4;

import java.util.Scanner;

public class ScannerRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Представьтесь!");
        String userName = scanner.nextLine();// next извлекает значение запрошенное у пользователя
        System.out.println("Добро пожаловать " + userName + "ВВедите число для расчета");
        int value = scanner.nextInt();//тк числовое значение
        System.out.println("Подтверждаем вы ввели  " + value);
        //каждый раз можно создать новый класс но с другим методом
        
    }
}
