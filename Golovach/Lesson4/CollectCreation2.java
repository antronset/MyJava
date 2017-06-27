package Golovach.Lesson4;

/**
 * Created by Антон on 27.06.2017.
 * Тоже массивный, но лучше
 */
public class CollectCreation2 {
    public static void main(String[] args) {

        Node tail;
        tail = new Node (0, null);
        tail = new Node (1, tail);
        tail = new Node (2, tail);
        tail = new Node (3, tail);
    }
}
