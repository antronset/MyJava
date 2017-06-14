package Shildt.SimpleExample.MethodObob;

/**
 * Created by Антон on 04.04.2017.
 */
public class GenMethDemo {

    static <T extends Comparable<T>, V extends T> boolean isIn (T x, V [] y){
        for (int i = 0; i < y.length; i++ )
            if (x.equals(y[i])) return true;
        return false;
    }

    public static void main(String[] args) {

        Integer nums [] = {1, 2, 3, 4, 5};
        if (isIn(2, nums)) System.out.println("Число 2 содержиться в массиве объектов");

        String strs [] = {"Один", "Два", "Три", "Четыре", "Пять"};
        if (isIn("Два", strs)) System.out.println("Два содрежиться в массиве str");
    }
}
