package BelHard.Task13;

import java.util.Arrays;

/**
 * Сделать класс-утилиту, которая умеет из заданного массива оставить только положительные числа
 */
public class ArraysPositiver {
    int counter = 0;
    int poscount = 0;

    void leftOnlyPositive(int array[]) {

        for (int i = 0; i < array.length; i++) { // check how much positive elements we have
            if (array[i] >= 0) counter++;
        }
        System.out.println(counter + " Positive ");

        int positiveArray[] = new int[counter];

        for (int j = 0; j < array.length; j++) {
            if (array[j] >= 0) {
                positiveArray[poscount] = array[j];
                poscount++;
            }

        }
        System.out.println(Arrays.toString(positiveArray));

    }
}
class ArraysPositiveDemo{
    public static void main(String[] args) {

        int demoArray [] = {1, -2, 5, -8, -158, 45, 418};
        ArraysPositiver ap = new ArraysPositiver();

        ap.leftOnlyPositive(demoArray);
    }
}