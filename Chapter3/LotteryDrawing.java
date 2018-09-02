package Chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawing
{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.println("What is the highest number can you draw? ");
        int n = in.nextInt();

        int[] numbers= new int[n];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i+1;
            // System.out.println(numbers[i]);
        }

        //结果集
        int[] results = new int[k];
        for (int i = 0; i < results.length;i++){
            int r = (int)(Math.random() * n);
            results[i] = numbers[r];
            numbers[r] = numbers[n - 1];
            n--;
        }
        Arrays.sort(results);
        System.out.println("Bet the following combination. It'll make you rich!");
        for (int r : results){
            System.out.println(r);
        }
    }
}