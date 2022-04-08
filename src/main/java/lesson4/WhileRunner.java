package lesson4;

public class WhileRunner {
    public static void main(String[] args) {
        int counter = 1;
//        while (true) {
//            if (counter <= 100) {
//                System.out.println(counter ++);
//            } else {
//                break;
//            }
//        }
//        while (true) {
//            System.out.println(counter++);//постфикс(изменения наступают при следующем обращении к переменной
//            System.out.println(++counter); // префикс изменения сразу же
//        }

        while (counter <= 100) {
            System.out.println(counter ++);
        }
        System.out.println("--------------");

        do {
            System.out.println(counter++);
        } while (counter <= 100);
    }
}
