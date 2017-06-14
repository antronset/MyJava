package Golovach.StandardSortAlgorithms;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;

/**
 * Created by Антон on 29.05.2017.
 */
public class SelectedSort {

    int barrier;
    int index;

    int [] selectedSort (int inputArr []){
        for (barrier = 0; barrier < inputArr.length-1; barrier++){
            for (index = barrier + 1; index < inputArr.length; index++){
                if (inputArr[barrier] > inputArr [index]) {
                    int tmp = inputArr [index];
                    inputArr [index] = inputArr[barrier];
                    inputArr[barrier] = tmp;
                }
            }
        } return inputArr;
    }
}
class SelectedSortDemo {
    public static void main(String[] args) {

        SelectedSort ss = new SelectedSort();
        int arr [] = {1,7,12,6,1,2};

        System.out.println(Arrays.toString(ss.selectedSort(arr)));
    }
}