package Golovach.Lesson4;

import java.util.Arrays;

/**
 * Created by Антон on 27.06.2017.
 */
public class CollectCreation4 {
    public static Node genRec (int ... v){
        return v.length == 0 ? null : new Node (v [0], genRec(Arrays.copyOfRange(v,1,v.length)));
    }
}
