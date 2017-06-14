package Golovach.Lesson2ProceduralJava;

import java.util.Arrays;

/**
 * Created by Антон on 29.05.2017.
 * Задача на совмещение 2, уже отсортированных, массивов. Решение: выбирать из
 * каждого массива наименьший элемент и вкидывать в третий.
 *
 * В данном примере есть ошибка!!!
 *
 * Ошибка исправлена!
 *
 */

public class ArraysMerge {

    int [] merge (int arr1 [], int arr2 []){
        int indexArr1 = 0;
        int indexArr2 = 0;
        int inserCount = 0;
        int resultArr [] = new int [arr1.length + arr2.length];

        for (int i = 0; i < resultArr.length-1; i++){
            if (arr1 [indexArr1] < arr2 [indexArr2]){
                resultArr [inserCount] = arr1 [indexArr1];
                indexArr1++;
                inserCount++;
                if (indexArr1 == arr1.length-1) {
                    System.arraycopy(arr2,indexArr2,resultArr,
                            inserCount+1,
                            arr2.length - indexArr2);
                }

            } else {
                resultArr [inserCount] = arr2 [indexArr2];
                indexArr2++;
                inserCount++;
                if (indexArr2 == arr2.length-1) {
                    System.arraycopy(arr1,indexArr1,resultArr,
                            inserCount+1,
                            arr1.length - indexArr1);
                }
        }
        }
        return resultArr;
    }
}
class ArraysMergeDemo {
    public static void main(String[] args) {

        int arr1 [] = {1,4,6,7,8,12};
        int arr2 [] = {2,4,6,8,10,12};
        ArraysMerge am = new ArraysMerge();

        System.out.println(Arrays.toString(am.merge(arr1,arr2)));


    }
}
