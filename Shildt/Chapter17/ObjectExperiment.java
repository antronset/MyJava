package Shildt.Chapter17;

/**
 * Created by Антон on 12.04.2017.
 */
public class ObjectExperiment {

    int age = 26;
    String name;

    ObjectExperiment (String n){
        name = n;
    }
}
class Demonstr {
    public static void main(String[] args) {
     ObjectExperiment oe = new ObjectExperiment("Anton");

        System.out.println(oe.name);


    }
}
