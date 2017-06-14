package Shildt.Chapter18;
import java.util.*;

/**
 * Created by Антон on 17.04.2017.
 */
public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> vals = new ArrayList<Double>();

        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        System.out.println("Содержимое массива: ");
        Spliterator<Double> splitr= vals.spliterator();
        while(splitr.tryAdvance((n)-> System.out.println(n)));
        System.out.println();

        splitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (splitr.tryAdvance((n)->sqrs.add((Math.sqrt(n)))));

        System.out.println("Содержимое массива");
        splitr = sqrs.spliterator();
        splitr.forEachRemaining((n)-> System.out.println(n));
        System.out.println();

    }
}
