package EducationalGame;

import java.io.Reader;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Антон on 17.04.2017.
 */
public class ConsoleVersion {
    public static void main(String[] args) {
        Random rd = new Random(System.currentTimeMillis());
        BackEnd be = new BackEnd();
        String rightAnswer;
        String wrongAnswer1;
        String wrongAnswer2;
        String wrongAnswer3;
        int counter = 0;
        do {
            System.out.println("Выбрите правильный вариант ответа: " + be.getRandomQuestion());
            System.out.println("Варианты ответа: ");
            int pretender = 0;


            rightAnswer = be.getRightAnswer();
            do {
                wrongAnswer1 = be.getRandomAnswers();
            } while (rightAnswer == wrongAnswer1);

            do {
                wrongAnswer2 = be.getRandomAnswers();
            } while ((rightAnswer == wrongAnswer2) & (rightAnswer == wrongAnswer1));

            do {
                wrongAnswer3 = be.getRandomAnswers();
            } while ((rightAnswer == wrongAnswer3)& (rightAnswer == wrongAnswer1) & (rightAnswer == wrongAnswer2));


            switch (rd.nextInt(3)) {
                case 0:
                    System.out.println("1 вариант: " + rightAnswer);
                    System.out.println("2 вариант: " + wrongAnswer1);
                    System.out.println("3 вариант: " + wrongAnswer2);
                    System.out.println("4 вариант: " + wrongAnswer3);
                    pretender = 1;
                    counter++;
                    break;
                case 1:
                    System.out.println("1 вариант: " + wrongAnswer1);
                    System.out.println("2 вариант: " + rightAnswer);
                    System.out.println("3 вариант: " + wrongAnswer2);
                    System.out.println("4 вариант: " + wrongAnswer3);
                    pretender = 2;
                    counter++;
                    break;
                case 2:
                    System.out.println("1 вариант: " + wrongAnswer1);
                    System.out.println("2 вариант: " + wrongAnswer2);
                    System.out.println("3 вариант: " + rightAnswer);
                    System.out.println("4 вариант: " + wrongAnswer3);
                    pretender = 3;
                    counter++;
                    break;
                case 3:
                    System.out.println("1 вариант: " + wrongAnswer1);
                    System.out.println("2 вариант: " + wrongAnswer2);
                    System.out.println("3 вариант: " + wrongAnswer3);
                    System.out.println("4 вариант: " + rightAnswer);
                    pretender = 4;
                    counter++;
                    break;
            }

            System.out.println("Введите номер правильного варианта: ");
            Scanner sc = new Scanner(System.in);

            if (sc.nextInt() == pretender) System.out.println("Правильно!");
            else System.out.println("Вы ошиблись, правильный вариант был: " + pretender);

        } while (counter < 5);

    }
}
