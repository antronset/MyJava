package Shildt.Chapter22;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Антон on 06.05.2017.
 */
public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);

        Address = InetAddress.getByName("www.perfectgirls.net");
        System.out.println(Address);

        InetAddress IA [] = InetAddress.getAllByName("www.perfectgirls.net");
        for (int i=0; i<IA.length; i++){
            System.out.println(IA[i]);
        }
    }
}
