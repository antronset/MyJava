package Golovach.Lesson4;

/**
 * Created by Антон on 27.06.2017.
 */
public class CollectToString {
    public static String toStringIter (Node tail){
        String result = "";
        while (tail != null){
            result += tail.value + "->";
            tail = tail.next;
        }
        return result;
    }

    public static String toStringRec (Node tail){
        return (tail == null) ? "*" : tail.value + "->" + toStringRec(tail.next);
    }
}
class CollectToStringDemo {
    public static void main(String[] args) {

        Node tail = CollectCreation4.genRec(0,1,2,3);
        System.out.println(CollectToString.toStringRec(tail));
    }
}
