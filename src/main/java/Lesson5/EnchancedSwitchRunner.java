package Lesson5;

public class EnchancedSwitchRunner {
    public static void main(String[] args) {
        String color = "green";
        int index = switch(color) {
            case "red" -> 1;
            case  "yellow" -> 2;
            case "green" -> 3;
            default -> -1;
        };
        System.out.println(index);
    }
}
