package ShagAcademy.Pattern_PublisherReceivers;

import java.io.IOException;
import java.nio.file.*;
import java.util.Vector;

/**
 * Created by Антон on 18.06.2017.
 */
public class FMonitor {

    String path;
    String addedFile;
    private Vector<IFileAdded> subscribersList;

    public FMonitor (String path) {
        this.path = path;
        subscribersList = new Vector<>();
    }

    public void addSubscriber (IFileAdded subscriber){
        subscribersList.add(subscriber);
    }

    public void removeSubscriber (IFileAdded subscriber){
        subscribersList.remove(subscriber);
    }

    protected void sender (){
        for (IFileAdded subscriber: subscribersList){
            subscriber.whatToDoWithAddedFile(addedFile);
        }
    }

    public void work () throws IOException, InterruptedException {
        WatchService watch = FileSystems.getDefault().newWatchService();
        Path directory = Paths.get(path);
        directory.register(watch, StandardWatchEventKinds.ENTRY_CREATE);

        for (int i=0; i<3; i++){
            WatchKey key = watch.take();

            for(WatchEvent ev: key.pollEvents()){
                addedFile = ev.context().toString();
                sender();
            }
            key.reset();
        }
        watch.close();
    }

}
