package Golovach.Lesson4;

/**
 * Created by Антон on 27.06.2017.
 */
public class DoubleNode {
    int value;
    DoubleNode prev;
    DoubleNode next;

    public DoubleNode(int value, DoubleNode prev, DoubleNode next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }
}
