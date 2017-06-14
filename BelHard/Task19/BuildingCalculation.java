package BelHard.Task19;

import java.util.Arrays;

/**
 * сделать иерархию классов и интерфейсов. Есть Строительная организация, которая предоставляет рабочих разного типа на
 * объекты строительства. Рабочие могут быть : прораб, каменщик, плотник, разнорабочий. В организации 2 прораба,
 * 5 каменщиков, 5 плотников, 20 разнорабочих. Стоимость работы часа прораба - 6$, каменщика 3,5$, плотника - 3$,
 * разнорабочего 1$. Разнорабочий может выполнять любую работу кроме прораба при условии что на стройке есть хотя бы 1
 * строитель такого же типа. Эффективность работы разнорабочего - 55% от работы каменщика и 45% от работы плотника.
 * Прораб сам работу не делает но увеличивает эффективность работы сотрудников на стройке - на 20%. Оплата сверхурочных
 * +50%, но не более 4 часов в день. И есть 2 объекта строительства. Первый - по трудозатратам - 2000 часов работы
 * каменщиков и 2500 плотников. Цель - сделать его как можно быстрее по времени. Второй - по трудозатратам тоже 2000
 * часов каменщиков и 2500 плотников но сделать его надо как можно дешевле, деньги в приоритете. Строительная компания
 * должна посчитать за какое время и за какие деньги она сможет выполнить всю работу на строительном объекте. Программа
 * должна уметь легко масштабироваться
 */
public class BuildingCalculation {

    //Ammounts of the workers
    int ammountForeman = 2;
    int ammountMason = 5;
    int ammountCarpenter = 5;
    int ammountHandyman= 20;

    //Salaries
    double salaryForeman = 6;
    double salaryMason = 3.5;
    double salaryCarpenter = 3;
    double salaryHandyman = 1;

    //AmmountOfWork - 2000 masons hours and 2500 carpenters

    double resultEffectivness;
    double allCombResult [] = new double [441];
    int counter = 0;
    double lowest = 0;

    double findTheLowest (){
        double theLowest = 0;
        for (int i=0; i < allCombResult.length-1; i++){
            if (allCombResult[i+1]<allCombResult[i]){
                theLowest = allCombResult [i+1];
            }
        }
        return theLowest;

    }

    void allPossibleCombinations (){

        for (int i=0; i <= ammountHandyman; i++){
            for (int j=0; j <= ammountHandyman; j++){
                resultEffectivness =  (2000/(5+0.55*i) + 2500/(5+0.45*j));
                allCombResult[counter] = i + j + resultEffectivness;
//                if (allCombResult[counter+1] < allCombResult[counter]){
//                    lowest = allCombResult [counter+1];
//                }
                counter++;
            }
        }
        for (int y=0; y < allCombResult.length; y++){
            System.out.println(allCombResult[y]);

//            System.out.println("\n The lowest is " + lowest);
 //       return allCombResult;

    }

}}
class BuildingDemo {
    public static void main(String[] args) {
        BuildingCalculation bc = new BuildingCalculation();
        bc.allPossibleCombinations();
       // System.out.println("The minimum time is " + bc.findTheLowest(bc.allPossibleCombinations()));
        System.out.println("the lowest is " + bc.findTheLowest());

    }
}

