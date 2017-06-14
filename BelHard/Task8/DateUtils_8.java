package BelHard.Task8;

import java.util.Scanner;

/**
 сделать класс DateUtils, который имеет статический метод по преобразованию числа,
 написанного цифрами, в число, написанное словами. Пример 685 - шестьсот восемьдесят пять
 */
public class DateUtils_8 {

    static void IntToStringConverter (){
        System.out.println("Please enter number: ");
        Scanner sc = new Scanner(System.in);
        int firstInts = sc.nextInt();
        String secondStr = String.valueOf(firstInts);
        System.out.println("You entered: ");
        for (int i = 0; i < secondStr.length(); i++){
            switch (secondStr.charAt(i)){
                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
            }
        }
    }
}
class DemoDateUtils {
    public static void main(String[] args) {
        DateUtils_8.IntToStringConverter();
    }
}