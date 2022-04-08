package lesson4;

public class StringRunner {
    public static void main(String[] args) {
        String text = "Война и мир. НАчало и конец";
        text += ". Новая фраза\n\t\r"; // конкатенация; text + ". Новая фраза"
        String str = "Hello World \\"; // экранирование
        // для того чтобы в строку внести спецсимволы
        System.out.println(str);

        //short digit = 120 + 545656;
        short value = 120;
        value += 545656;
        System.out.println("Значение переменной value = " + value);
    }
}
