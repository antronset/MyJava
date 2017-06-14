package BelHard.Task5;

import java.util.Scanner;

/**
 * Created by Антон on 14.06.2017.
 * найти наименьшее общее кратное и наибольший общий делитель чисел, вводимых с консоли
 */
public class NODandNOK {
    int firstDigit, secondDigit;
    int exitWish;

    Scanner sc = new Scanner(System.in);

    void userInterface() {

        do{
            System.out.println("Program will find the NOD ");
            System.out.print("Enter the first digit: ");
            firstDigit = sc.nextInt();
            System.out.print("Enter the second digit: ");
            secondDigit = sc.nextInt();
            System.out.println("Nod equals to " + findNOD(firstDigit, secondDigit));
            System.out.println("Nok equals to " + findNOK(firstDigit, secondDigit));
            System.out.println("Do you want to exit? [1 - exit]");
            exitWish = sc.nextInt();
        } while (exitWish != 1);

    }

    int findNOD(int a, int b) {
        return b == 0 ? a : findNOD(b, a % b);
    }

    int findNOK(int a, int b) {
        return a / findNOD(a, b) * b;
    }
}

class UseNodAndNok {
    public static void main(String[] args) {

        NODandNOK find = new NODandNOK();
        find.userInterface();
    }
}
