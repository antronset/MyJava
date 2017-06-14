package EducationalGame;
import java.util.Random;
/**
 * Created by Антон on 17.04.2017.
 */
public class BackEnd {

    private String definition [] = {"Collection", "Deque", "List", "NavigableSet", "Queue", "Set", "SortedSet"};
    private String answers [] = {"Позволяет работать с группами объектов. Находится на вершине иерархии коллекций",
            "Расширяет интерфейс Queue для организации двусторонних очередей",
            "Расширяет интерфейс Collection для управления последовательностями (списками объектов)",
            "Расширяет интерфейс SortedSet для извлечения элементов по результатам поиска ближайшего совпадения",
            "Расширяет интерфейс Collection для управления специальными типами списков, где элементы удаляются только из начала списка",
            "Расширяет интерфейс Collection для управления множествами, которые должны содержать однозначные элементы",
            "Расширяет интерфейс Set для управления атсортированными множествами",
    };

    static Random rd = new Random(System.currentTimeMillis());
    int indexOfDefinit;

    String getRandomQuestion (){
        indexOfDefinit = rd.nextInt(definition.length-1);
        return definition[indexOfDefinit];
    }

    String getRandomAnswers (){
        return answers[rd.nextInt(answers.length-1)];
    }

    String getRightAnswer (){
        return answers[indexOfDefinit];
    }

    boolean checkRightAnswer (String a, String b){
        if(a.equals(b)) return true;
        else return false;
    }

}
