package lesson4;

public class SwitchRunner {
    public static void main(String[] args) {
        System.out.println(getSolutionShpetofore("желтый"));
        System.out.println(getSolutionShpetofore("Красный"));
        System.out.println(getSolutionShpetofore("зеленый"));
    }

    public static String getSolutionShpetofore(String color) {
        String result;
        switch (color) {
            case "желтый":
            case "Красный": {
                result =  "Красный стой";
                break;//одинаковая обработка на желтый и красный
            }
//            case "желтый", "Красный": {
//                result =  "желтый жди";
//                break;
//            }
            case "зеленый": {
                result =  "зеленый иди";
                break;
            }
            default: {
                result =  "";
                break;
            }
        }
        return result;
    }
}

