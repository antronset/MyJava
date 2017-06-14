package Shildt.Chapter10;

import java.util.Random;

/**
 * Created by Антон on 27.03.2017.
 */
public class HandleError {
    public static void main(String[] args) {

        int a,b,c;
        a=b=c=0;
        int counterEXC = 0;

        Random assistantR = new Random();

        for (int i=0; i<3200; i++){
            try {
                c = assistantR.nextInt(10);
                a = 12345 / c;
                System.out.println("a = " + a);
            } catch (ArithmeticException exc) {
                System.out.println("Division by zero");
                a = 0;
                counterEXC++;
                System.out.println("counterEXC = " + counterEXC);
            }
        }
    }
}
