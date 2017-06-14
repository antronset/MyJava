package Shildt.SimpleExample.MetaSymbol;

/**
 * Created by Антон on 04.04.2017.
 */
public class Stats <T extends Number> {

    T [] nums; // массив класса Number или его подкласса

    Stats(T[] o){
        nums = o;
    }

    double average (){
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i].doubleValue();
        return sum / nums.length;
    }

    // определить равенство средних значений
    boolean sameAvg (Stats<?> ob){
        if (average() == ob.average())
            return true;
        return false;
    }
}

class WildcardDemo {
    public static void main(String[] args) {

        Integer inums [] = { 1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<Integer>(inums);
        double v = iOb.average();
        System.out.println("Среднее значение iOb равно " + iOb.average());

        Double dnums [] = { 1.0, 2.1, 3.2, 4.3, 5.4};
        Stats<Double> dOb = new Stats<Double>(dnums);
        double w = dOb.average();
        System.out.println("Среднее значение dOb равно " + w);

        System.out.print("Идет процесс сравнения  ");

        try {

            for (int i = 0; i < 5; i++ ){
                Thread.sleep(1000);
                System.out.print(".");
            }
            System.out.println();

            if (iOb.sameAvg(dOb) == true) System.out.println("Значения совпадают");
            else System.out.println("Значения не совпадают");
        } catch (InterruptedException e) {
            System.out.println("Ошибка: " + e);
        }

    }
}

