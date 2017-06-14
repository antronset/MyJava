package Golovach.Lesson2ProceduralJava;

import java.util.Arrays;

/**
 * Created by Антон on 31.05.2017.
 * Сортировку выборкой можно существенно ускорить, если добавить алгоритм бинарного поиск
 * и копировать с помощью Arraycopy. Сейчас попробую:)
 *
 * В целом работает. Но возникают глюки, если последний элемент низкий. И работает только с различными
 * элементами (но это просто исправить)
 */
public class ImprovedSelectionSort {

    int barrier;
    int newElement;
    int location;
    int searchResult;

    int [] improvedInsertionSort (int inputArr []){
        for (barrier = 1; barrier < inputArr.length; barrier++){
            newElement = inputArr [barrier];
            location = barrier - 1;
            searchResult = Arrays.binarySearch(inputArr,0, barrier, newElement);
            System.out.println(searchResult);

            if (searchResult < 0){
                if (inputArr [barrier] != inputArr[(-searchResult)-1]){
                    System.arraycopy(inputArr,
                            (-searchResult)-1,
                            inputArr,
                            barrier,
                            barrier -((-searchResult)-1) );
                    inputArr[(-searchResult)-1] = newElement;
                }

            } else {

            }

        }
        return  inputArr;
    }

}
class ImprovedSelectionSortDemo{
    public static void main(String[] args) {

        int [] arr = {1, 6, 2, 4, 5};

        ImprovedSelectionSort iss = new ImprovedSelectionSort();
        System.out.println(Arrays.toString(iss.improvedInsertionSort(arr)));
    }
}
