package BelHard.Task9;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Антон on 15.06.2017.
 * сделать игру горячо-холодно - программа загадывает число, а пользователь пытается его отгадать,
 * программа должна вернуть "горячо" "холодно" или сообщение что число угадано. Если число угадано,
 * нужно вернуть также за сколько попыток оно было угадано. Пользователь может выбрать в каком
 * диапазоне будет загадано число
 *
 */
public class HotOrCold {

    private int range;
    private int rightAnswer;
    private int userChoise;
    private int counter = 0;
    Random r = new Random(System.currentTimeMillis());
    Scanner s = new Scanner(System.in);


    void theGame (){
        System.out.println("Enter the range, please: ");
        this.range = s.nextInt();
        System.out.println("You choose " + this.range);
        rightAnswer = r.nextInt(range);
        System.out.println("right answer is " + rightAnswer);
        System.out.println("Guess the number. From 0 to " + range);
        do {System.out.println("Guess the number:");
            userChoise = s.nextInt();
            if (userChoise > rightAnswer) System.out.println("Right answer is lower");
            else if (userChoise < rightAnswer) System.out.println(("Right answer is higher"));
            counter++;
        }while (userChoise != rightAnswer);

        System.out.println("You win!!!");
        System.out.println("You made " + counter + " attempt to guess the number");
    }
}

class UseHotOrCold {
    public static void main(String[] args) {

        HotOrCold hoc = new HotOrCold();
        hoc.theGame();

    }
}