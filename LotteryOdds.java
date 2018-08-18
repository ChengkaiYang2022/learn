import java.util.Scanner;
public class LotteryOdds{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw?");
        int k = scanner.nextInt();

        System.out.println("What is the highest number you can draw?");
        int n = scanner.nextInt();

        int lotteryOdds = 1;
        for (int i = 1; i <= k ; i++){
            lotteryOdds = lotteryOdds * (n - i + 1)/i;
        }
        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");

    }
}