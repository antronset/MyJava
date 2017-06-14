package BelHard.Task6;

/**
 * Created by Антон on 14.06.2017.
 * есть 2 int переменные. Поменять их значения местами с помощью доп. переменной, операции xor
 */
public class ChangeTwo {

    int firstD,secondD;

    ChangeTwo(int firstD, int secondD){
        this.firstD = firstD;
        this.secondD = secondD;
    }

    void additionalTemp (){
        int tmp = firstD;
        firstD = secondD;
        secondD = tmp;
    }

    void byXor(){
        firstD = firstD ^ secondD;
        secondD = firstD ^ secondD;
        firstD = firstD ^ secondD;
    }
}
class UseChangeTwo {
    public static void main(String[] args) {

        ChangeTwo ct = new ChangeTwo(3,5);
        System.out.println("first digit is - " + ct.firstD +
                " second -  " + ct.secondD);

        ct.byXor();
        System.out.println("After xor first digit is - " +
                ct.firstD + " second -  " + ct.secondD);

        ct.additionalTemp();
        System.out.println("After additional temp first digit is - "
                + ct.firstD + " second -  " + ct.secondD);

    }
}
