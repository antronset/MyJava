package Golovach.Lesson4;

/**
 * Created by Антон on 27.06.2017.
 * Пример элемента односвязного списка.
 */
public class Node {
    int value;
    Node next; // важно понимать. Что здесь будет
    // хранится не объект Node, а ссылка на него.

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
