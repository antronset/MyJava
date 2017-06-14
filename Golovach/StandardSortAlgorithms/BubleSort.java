package Golovach.StandardSortAlgorithms;

import java.util.Arrays;

/**
 * Created by Антон on 29.05.2017.
 */
public class BubleSort {

    int barrier;
    int index;

    int [] bubleSort (int inputArr []){
        for (barrier = inputArr.length-1; barrier > 0; barrier--){
            for(index = 0; index < barrier; index++){
                if (inputArr[index] > inputArr [index+1]) {
                    int tmp = inputArr [index];
                    inputArr [index] = inputArr [index+1];
                    inputArr [index+1] = tmp;
                }
            }
        } return inputArr;
    }

}

class BubleSortDemo {
    public static void main(String[] args) {

        BubleSort bs = new BubleSort();
        int demoArr[] = {1,7,9,5,12,45};

        System.out.println(Arrays.toString(bs.bubleSort(demoArr)));
    }
}
