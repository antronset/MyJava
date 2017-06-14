package Golovach.Lesson1ProceduralJava;

import java.util.Arrays;

/**
 * Created by Антон on 11.05.2017.
 * Инвертировать массив
 */
public class InvertArray {

    void invertRec (int data []){

        for (int i=0; i < data.length/2; i++){
            int tmp = data[i];
            data[i] = data [data.length - 1 - i];
            data [data.length - 1 - i] = tmp;
        }
    }

}

class InverArrayDemo {
    public static void main(String[] args) {

        InvertArray ia = new InvertArray();
        int arr [] = {1, 2, 3, 4, 5};

        ia.invertRec(arr);
        System.out.println(Arrays.toString(arr));
    }
}