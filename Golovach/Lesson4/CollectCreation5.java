package Golovach.Lesson4;

import java.util.Arrays;

/**
 * Created by Антон on 27.06.2017.
 */
public class CollectCreation5 {

    public static Node genRecFull (int ... v){
        if (v.length == 0) {
            return null;
        }
        else {
            int [] newArray = Arrays.copyOfRange(v,1,v.length);
            Node next = genRecFull(newArray);
            return new Node (v[0], next);
        }
    }
}
