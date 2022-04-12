package Lesson5;

import java.util.Scanner;

public class IntRunner {
    public static void main(String[] args) {
        int i = 5;
        String str = "Privet";
        String another = new String("Hello");
        //классы оболочки
        Integer value = 5;
        int anotherValue = value;
        Integer nullValue = null;
        Long bigValue = 12564232222L;
        Double dValue = 2.5;
        Character symbol = 'b';
        Integer integer = Integer.valueOf("123456");
        System.out.println("Проблем с конвертацией числа " + integer + "не обнаружено");
        System.out.println("--------------");
        System.out.println(integer == Integer.valueOf(123456));//false
        System.out.println(integer.equals(Integer.valueOf(123456)));//true тк сравнивает значение
        System.out.println("--------------");
        System.out.println(Integer.valueOf(100) == Integer.valueOf(100));//2 ссылки ведут на один обьект...
        //это 2 разные ссылки в памяти,

        // F(0) = 0  F(1) = 1     Fn = F(n-1) + F(n-2), N>=2
        //вывести nй член последовательности Фибоначчи
        //параметр n запрашивается у пользователя
        // сделать через цикл с присвоением каждой итерации маркера
        // вне поля цикла спросить у пользователя любое число и выводить его позицию  в ряде Фибо

        // следующее число -- сумма двух предыдущих!
        int Fo = 0;
        int F1 = 1;
        int x;//переменная с заданным числом
        int summ = 1;
        System.out.println("Введите число ----");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
//        if (!s.hasNextInt() || !s.hasNextDouble() || s.hasNext()) {//проверка на то что вводится число
//            String chislo = s.next();
//            System.out.println("Введите числовое значение! вместо -----> " + chislo);
//        }
        while (Fo++ < x) {//считаем до заданного числа
            System.out.println(summ + " ");
            summ = Fo + F1;
            Fo = F1;// помещаем предыдущий член последовательности в первую переменную для инициации предпредыдущего члена последовательности
            F1 = summ;// помещаем предыдущий член последовательности во вторую переменную для инициации предыдущего члена последовательности
            System.out.println(" n 4len для заданного числа  " + (F1 - 2));
        }
    }
}
