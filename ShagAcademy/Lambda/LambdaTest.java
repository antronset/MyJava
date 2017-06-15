package ShagAcademy.Lambda;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

/**
 * Created by Антон on 15.06.2017.
 */
public class LambdaTest {
    public static void main(String[] args) {

     File f = new File(".");

     try {
         File[] catalogsContent = f.listFiles((pathname) -> !pathname.isDirectory());
         for (File temp : catalogsContent) System.out.println(temp);
     }catch (SecurityException e){
         System.out.println("Exception " + e);
     }
    }
}


//class notDirectoryFilter implements FileFilter{
//    @Override
//    public boolean accept(File pathname) {
//        return !pathname.isDirectory();
//    }
//}