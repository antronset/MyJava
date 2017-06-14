package Golovach.Lesson2ProceduralJava;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Антон on 29.05.2017.
 */
public class BinarySearchSimpleUse {
    public static void main(String[] args) {

        int arr [] = new int[15];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i*2;
        }

        System.out.println(Arrays.toString(arr));
        int pos = Arrays.binarySearch(arr, 9);
        System.out.println(pos);

    }
}
