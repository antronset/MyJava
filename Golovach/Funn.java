package Golovach;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Антон on 10.05.2017.
 * визуализированная сортировка пузырьком
 */
public class Funn {
    public static void main(String[] args) throws InterruptedException {
        int [] array = new int [10];
        Random rd = new Random(System.currentTimeMillis());
        for (int i = 0; i < array.length - 1; i++){
            array [i] = rd.nextInt(99);
        }
        System.out.println(Arrays.toString(array));
        int barrier;

        for (barrier = 9; barrier > 0; barrier--){
            for (int k = 0; k < barrier; k++){
                swap(array,k,k+1);
                Thread.sleep(1000);
                System.out.println();
            }
        }
    }

    public static void swap(int[] array, int fst, int snd) {
        if (array[fst] > array[snd]) {
            int tmp = array[fst];
            array[fst] = array[snd];
            array[snd] = tmp;

            for (int j = 0; j < fst + 1; j++) {
                System.out.print(array[j] + " ");
            }

            System.out.print("[" + array[snd] + "] ");

            for (int z = snd + 1; z < array.length; z++) {
                System.out.print(array[z] + " ");
            }
        }else {

            for (int j = 0; j < fst + 1; j++) {
                System.out.print(array[j] + " ");
            }

            System.out.print("[" + array[snd] + "] ");

            for (int z = snd + 1; z < array.length; z++) {
                System.out.print(array[z] + " ");
            }
        }
    }
}




