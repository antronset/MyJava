package ShagAcademy.TicTak;

/**
 * Created by Антон on 21.06.2017.
 */
public class Data {
    private int state=1;
    public int getState (){
        return state;
    }

    public void Tic () {
        if (state==1){
            System.out.print("Tic - ");
            state=2;
            notify();
        }
        while (state==2) try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void Tak (){
        if(state==2){
            System.out.println("Tak");
            state=1;
            notify();
        }
        while (state==1) try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

