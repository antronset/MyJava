package ShagAcademy.PublisherReceiversAnother;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Антон on 24.06.2017.
 */
public class TaskManager {

    private ArrayList<TaskListener> listenersList = new ArrayList<>();

    public synchronized void addTaskListener(TaskListener tlist) {
        listenersList.add(tlist);
    }

    public synchronized void removeTaskListener(TaskListener tlist) {
        listenersList.remove(tlist);
    }

    private void notifyTargets(int eventID, String name) {
        ArrayList<TaskListener> copy;
        synchronized (this) {
            copy = (ArrayList<TaskListener>) listenersList.clone();
        }
        TaskData ev = new TaskData(this, name);
        for (TaskListener temp : copy) {
            if (eventID == 1) temp.start(ev);
            else temp.stop(ev);
        }
    }
    public void works() throws InterruptedException {
        Random rnd = new Random();
        Thread.sleep(rnd.nextInt(2000));
        notifyTargets(1,"");
        Thread.sleep(rnd.nextInt(4000));
        notifyTargets(2,"");
    }
}
