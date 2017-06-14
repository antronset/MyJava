package Shildt.Chapter10;

/**
 * Created by Антон on 28.03.2017.
 */
public class TroyanException extends Exception{
    private int details;

    TroyanException (int a){
        details = a;
    }

    public String toString (){
        return "Возникло исключение имени Трояна, немедленно выключите компьютер. Дополнительная " +
                "информация - " + details;
    }
}
class MethodWithException {

    void compute (int a) throws TroyanException{
        System.out.println("Запуск метода");
        if (a == 7) throw new TroyanException(a);
        System.out.println("method succeed successfully");
    }

    public static void main(String[] args) {
        MethodWithException m = new MethodWithException();

        try {
            m.compute(5);
            m.compute(7);
        } catch (TroyanException te) {
            System.out.println(te);
        }
    }
}

