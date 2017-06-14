package Shildt.SimpleExample.SelfMade;

/**
 * Created by Антон on 04.04.2017.
 */
public class Gen <T> {

    T ob;

    Gen (T o){
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType (){
        System.out.println("Тип переменной = " + ob.getClass().getName());
    }
}

class demo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(7);

        System.out.println(iOb.getOb());
        int v = iOb.getOb();
        System.out.println("Значение iOb = " + v);
        iOb.showType();


    }
}