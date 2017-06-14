package Golovach.Lesson1ProceduralJava;

import java.util.Arrays;

/**
 * Created by Антон on 11.05.2017.
 * инвертированная сортировка пузырьком
 */
public class InvertedBubleSort {

    void swap (int data []){
    for (int i=0; i<data.length; i++){
        for (int barrier = data.length-1; barrier>0; barrier--){
            if (data[barrier] < data[barrier-1]) {
                int tmp = data[barrier];
                data[barrier] = data[barrier-1];
                data[barrier-1] = tmp;
            }
        }
    }
    }
}
class InvertedBubleSortDemo {
    public static void main(String[] args) {
        InvertedBubleSort ibs = new InvertedBubleSort ();
        int arr [] = {1,4,17,4,5,9,49,46,4};

        ibs.swap(arr);

        System.out.println(Arrays.toString(arr));

    }
}
