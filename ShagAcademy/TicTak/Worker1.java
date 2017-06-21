package ShagAcademy.TicTak;

/**
 * Created by Антон on 21.06.2017.
 */
public class Worker1 extends Thread {
    private int id;
    private Data data;


    public Worker1 (int id, Data d){
        this.id=id;
        data=d;
        this.start();
    }

    @Override
    public void run() {
        synchronized (data){
            for (int i=0; i<5; i++){
                if (id==1) {
                    data.Tic();

                }
                else data.Tak();
            }
        }


    }
}
