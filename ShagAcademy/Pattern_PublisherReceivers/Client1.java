package ShagAcademy.Pattern_PublisherReceivers;

/**
 * Created by Антон on 18.06.2017.
 */
public class Client1 implements IFileAdded {

    @Override
    public void whatToDoWithAddedFile(String name) {
        System.out.println("File was created " + name);
    }
}
