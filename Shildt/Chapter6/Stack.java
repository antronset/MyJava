package Shildt.Chapter6;

/**
 * Created by Антон on 23.03.2017.
 */
public class Stack {
    int stck [] = new int [10];
    int tos;

    //инициализировать вершину стека
    Stack (){
        tos = -1;
    }

    //разместить элемент в стеке
    void push (int item) {
        if (tos==9) System.out.println("Stack is full");
        else stck[++tos] = item;
    }

    //извлечь элемент из стека
    int pop () {
        if (tos < 0) {
            System.out.println("Stack is not loaded");
            return 0;
        } else return stck [tos--];
    }
}

class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        mystack1.push(7);

        for (int i=0; i<10; i++){
            System.out.println(mystack1.pop());
        }



    }
}
