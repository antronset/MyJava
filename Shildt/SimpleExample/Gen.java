package Shildt.SimpleExample;

/**
 * Created by Антон on 04.04.2017.
 */

public class Gen <T> {
    T ob; // объявить объект типа Т

    // передать конструктору ссылку на объект типа Т
    Gen(T o){
        ob = o;
    }

    // возваратить объект ob
    T getOb () {
        return ob;
    }

    // показать тип Т
    void showType (){
        System.out.println("Типом Т является " + ob.getClass().getName());
    }
}

class GenDemo {
    public static void main(String[] args) {

        // создать ссылку типа Gen для целых чисел и объявить объект Типа Gen <Integer>
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);

        iOb.showType();
        int v = iOb.getOb();
        System.out.println("Значение: " + v);
        System.out.println();


        Gen<String> strOb = new Gen<String>("Тест обобщений");

        strOb.showType();
        String str = strOb.getOb();
        System.out.println("Значние: " + str);

    }
}