package Shildt.Chapter19;
import java.util.*;

/**
 * Created by Антон on 20.04.2017.
 */
class Watcher implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Метод update() вызван, отсчет count равен "
                + ((Integer)arg).intValue());
    }
}
class BeingWatched extends Observable {
    void counter (int period){
        for ( ; period >=0; period--){
            setChanged();
            notifyObservers(new Integer (period));
            try{
                Thread.sleep(100);
            } catch (InterruptedException e){
                System.out.println("Ожидание прервано");
            }
        }
    }
}
class ObserverDemo {
    public static void main(String[] args) {
        BeingWatched observed = new BeingWatched();
        Watcher observing = new Watcher();
        observed.addObserver(observing); // связывание наблюдателя и наблюдаемого объекта
        observed.counter(10);
    }
}

