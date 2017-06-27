package Golovach.Lesson4;

/**
 * Created by Антон on 27.06.2017.
 */
public class CollectCreation3 {

    public static Node genIter (int ...  values){
        Node tail = null;
        for (int k = values.length-1; k >= 0; k--){
            tail = new Node (values[k], tail);
        }
        return tail;
    }

    public static void main(String[] args) {
        Node tail = genIter(0,1,2,3);
    }
}
