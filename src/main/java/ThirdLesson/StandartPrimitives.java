package ThirdLesson;

public class StandartPrimitives {
    public static void main(String[] args) {
        byte argument = 123;// -128...-10123...127   -2 ^ 7 .. 2 ^ 7 - 1
        byte errorDigit = (byte) 129;//все что больше 128 в результате на увеличение в сторону нуля
        byte digit = (byte) (28 + 100);
        System.out.println(errorDigit);

        short anotherDigit = 768;// - 2 ^ 15.. 2 ^ 15 - 1
        int arg = Integer.MAX_VALUE;// -2 ^ 31...2 ^ 31 - 1
        System.out.println(arg);
        long bigValue =  2147483648L;// - 1 ^ 63 .. 2 ^ 63 - 1

        char symbol = 'Я';// 16 битный  0 ...2 ^ 16 - 1
        // Я --> символ целое число(представление) которого 1071
        System.out.println(symbol + 1);

        double digitWithPoint = 3.14; // 64 битный
        float floatValue = 100.25F; // 32 битный

        boolean flag = true; // истина
        boolean lie = false; // ложь

        boolean value = 100 != 1_000_000; // true -- неравно
        boolean value1 = 100 == 1_000_000; // false --  равно
        boolean notValue = !value; // false !- отрицание

        boolean complexAnd = (100 == 100) && (125 == 125); // true = true & true; & - и
        boolean complexOr = (100 == 100) || (125 == 125); // true = true | true; | - или

        double floatingPointValue = 1.5;
        double anotherValue = 2.5;
        if (anotherValue == floatingPointValue) {
            System.out.println("anotherValue не равно " + floatingPointValue);
        } else if (1 == 1 && anotherValue == floatingPointValue){
            System.out.println("anotherValue не равно " + floatingPointValue + "но 1 = 1");
        } else {
            System.out.println("anotherValue не равно " + floatingPointValue);
        }

        boolean bool1 = floatingPointValue != 0 && (100 / floatingPointValue == 10);


        //a * x^2 + b * x + c = 0
        // a = ax^2
        // b == bx
        // c = c
        // формулу для нахождения корней.

        // x1,2 = -b +(-) √b2 − 4ac / 2a // 2 korna
        // D = b^2 - 4ac

        formula(3,5,6);
    }

    public static void formula(double arg1, double arg2, double arg3) {
        double a = arg1;
        double b = arg2;
        double c = arg3;
        String str = "-?\\d+(\\.\\d+)?";
        double discr = Math.pow(a, 2) - 4 * a * c;
        if(a != '.' || b != '.' || c !='.') {
           if (discr < 0) {
               System.out.println("нет решений уравнений тк " + discr + "меньше 0");
           } else if (discr == 0) {
               double x = - b / ( 2 * a);
               System.out.println("первый коэффициент не может быть 0 тк значение  = " + discr);
           }else if(discr > 0) {
               double y = - b + Math.sqrt(discr) / (2 * a);
               double z = - b - Math.sqrt(discr) / (2 * a);
               System.out.println("уравнение имеет корень 1 с коэф " + y +
                       "второй корень " + z);
            }
        }
    }
      //проверка на то что введено чилсо
    public static boolean isNumeric(String str)
    {
        try
        {
            double d = Double.parseDouble(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }

    // 1 * 2 * ... * n
    // 1 != 1 2 != 2 etc
    // в тз неочевидно что нужны цикл

    public static void factorial(double a) {
          double res = 1;
          if (a < 0 ) {
              System.out.println("факториал не может быть меньше 0");
          } else if (a == '.' || a == ' ') {
              System.out.println("факториал не может быть буквенным");
          } else if (a > 0) {
               for (int i = 1;  i <= a; i++){
                   res = res * i;
               }
          }
    }

}
