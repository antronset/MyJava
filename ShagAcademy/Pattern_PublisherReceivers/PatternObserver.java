package ShagAcademy.Pattern_PublisherReceivers;

import java.io.IOException;

/**
 * Created by Антон on 18.06.2017.
 */
public class PatternObserver {
    public static void main(String[] args) throws IOException, InterruptedException {

        FMonitor fm = new FMonitor("C:\\Users\\Антон\\Desktop\\Картинки");
        Client1 c1 = new Client1();

        fm.addSubscriber(c1);
        fm.work();

    }
}
