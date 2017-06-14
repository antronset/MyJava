package ShagAcademy.RW;

import java.io.*;


/**
 * Created by Антон on 11.06.2017.
 */

public class RW {

    static void write (double doubleArray [], String fileName){
        try(DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))){
            for (double temp: doubleArray){
                dos.writeDouble(temp);
            }
        } catch (IOException e){e.printStackTrace();}
    }

    static void read (String fileName){
        try(DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)))){
            double temp;
            do{
                temp = dis.readDouble();
                System.out.println(temp);
            } while (temp != -1);
        } catch (EOFException e){
            System.out.println("File reading and printing is completed");
        }
        catch (IOException e){e.printStackTrace();}
    }
}

class RWDemo{
    public static void main(String[] args) {

        double [] d = {2.7, 1.09, 3, 5 ,8, 9.105, 1e2};
        RW.write (d, "data.txt");
        RW.read("data.txt");

    }
}
