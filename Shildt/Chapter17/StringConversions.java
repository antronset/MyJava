package Shildt.Chapter17;

import java.util.Scanner;

/**
 * Created by Антон on 11.04.2017.
 */
public class StringConversions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a digit: ");
        int num = sc.nextInt();

        System.out.println("Your digit in binary format is: " + Integer.toBinaryString(num));
        System.out.println("Your digit in восьмеричной format is: " + Integer.toOctalString(num));
        System.out.println("Your digit in шестнадцатеричной format is: " + Integer.toHexString(num));
    }
}
