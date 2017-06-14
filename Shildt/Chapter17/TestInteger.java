package Shildt.Chapter17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Антон on 11.04.2017.
 */
public class TestInteger{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputData;
        int fromStringToInt;
        int sum = 0;

        System.out.println("Введите число: [0 для выхода]");
        do{
            inputData = br.readLine();
            try{
                fromStringToInt = Integer.parseInt(inputData);
            } catch (NumberFormatException e){
                System.out.println("Неверный формат " + e);
                fromStringToInt = 0;
            }
            sum += fromStringToInt;
            System.out.println("Текущая сумма: " + sum);
        } while (fromStringToInt != 0);


    }
}
