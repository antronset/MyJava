package ShagAcademy.TicTak;

/**
 * Created by Антон on 21.06.2017.
 */
public class Example {
    public static void main(String[] args) throws InterruptedException {

        Data d = new Data();

            Worker1 w2 = new Worker1(1,d);
            Worker1 w1 = new Worker1(2,d);
            w2.join();
            w1.join();


        System.out.println("End of main");
    }
}
