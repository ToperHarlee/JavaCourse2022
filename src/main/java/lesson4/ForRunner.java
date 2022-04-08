package lesson4;

public class ForRunner {

    public static void main(String[] args) {
        int globalCounter;
        for (int counter = globalCounter =1, value = 123; counter <= 100 && value <= 500; counter++, value++) {
            if (counter % 2 == 0) {
                System.out.println("Текущее значение счетчика:  " + counter);
                if (counter > 50) {
                    break;
                }
            }
        }
        System.out.println("-----");
//        for (;;) {
//           System.out.println(globalCounter++);
//        } // бесконечный цикл

       int cvadrat = mySqrt(25);
       System.out.println(cvadrat);

    }
    // квадратный корень числа без Math
    // 2 * 2 = 4; 4 * 4 = 16

    public static int mySqrt(int x) {
        if (x == 1) {
            return  x;
        }
        int counter = 1;
        while (counter * counter <= x) { // счет до момента пока сумма кореней не будет совпадать с заданным числом x
            if (counter * counter <= 0 ) {
                System.out.println("корень не может быть меньше 0");
                break;
            }
            counter++;
        }
        return --counter;//чтобы число после завершения цикла было на 1 меньше тк <= while обработает еще 1 раз
    }



}
