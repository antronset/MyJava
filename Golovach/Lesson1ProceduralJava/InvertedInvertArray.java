package Golovach.Lesson1ProceduralJava;

import java.util.Arrays;

/**
 * Created by Антон on 11.05.2017.
 * инвертирование массива иным способом
 */
public class InvertedInvertArray {

    void InvertRec (int data []){

        int counter = 1;
        for (int i=data.length/2; i > 0; i--){
            int tmp = data[data.length/2 - counter];
            data[data.length/2 - counter] = data[data.length/2 + counter - 1];
            data[data.length/2 + counter - 1] =  tmp;
            counter++;
        }
    }
}
class InvertedInvertArrayDemo {
    public static void main(String[] args) {
        InvertedInvertArray iia = new InvertedInvertArray();
        int arr [] = {1,2,3,4,5,6};

        iia.InvertRec(arr);
        System.out.println(Arrays.toString(arr));
    }
}
