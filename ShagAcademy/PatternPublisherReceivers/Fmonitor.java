package ShagAcademy.PatternPublisherReceivers;

import java.io.IOException;
import java.nio.file.*;
import java.util.Vector;

/**
 * Created by Антон on 18.06.2017.
 */
public class Fmonitor {

    private String path;
    private String fileAdded;
    private Vector<IFileAdded> list;

    //конструктор. При создании объекта - нужно указать пусть директории которая
    //будет просматриваться
    public Fmonitor(String path){
        this.path = path;
        list = new Vector<IFileAdded>();
    }

    //добавить слушателя в нашу рассылку будущую
    public void addListener (IFileAdded client){
        list.addElement(client);
    }

    //убрать слушателя
    public void removeListener (IFileAdded client){
        list.remove(client);
    }

    //произвести рассылку
    protected void fireAdded () {
        for (IFileAdded client : list) {
            client.added(fileAdded);
        }
    }

    //получить содержание рассылки - узнать, что за новые файлы были добавлены?
    public void work () throws IOException {
        WatchService watch = FileSystems.getDefault().newWatchService();
        Path directory = Paths.get(path);
        directory.register(watch,StandardWatchEventKinds.ENTRY_CREATE);
        

    }
    }

