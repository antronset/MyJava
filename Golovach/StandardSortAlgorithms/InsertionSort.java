package Golovach.StandardSortAlgorithms;

import java.util.Arrays;

/**
 * Created by Антон on 29.05.2017.
 */
public class InsertionSort {

    int barrier;
    int newElement;
    int location;

    int [] insertionSort (int inputArr []){
        for (barrier = 1; barrier < inputArr.length; barrier++){
            newElement = inputArr [barrier];
            location = barrier - 1;

            while (location >= 0 && inputArr [location] > newElement){
                inputArr [location+1] = inputArr [location];
                location--;
            }
            inputArr [location+1] =  newElement;
        }
        return  inputArr;
    }

}

class InsertionSortDemo {
    public static void main(String[] args) {

        InsertionSort is = new InsertionSort();
        int arr [] = {1,5,1,78,32,2};

        System.out.println(Arrays.toString(is.insertionSort(arr)));

    }
}
