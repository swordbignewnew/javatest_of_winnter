package winterstudying.random;

import java.util.Random;
import java.util.Scanner;

public class guessgame {
    public static void main(String[] args) {
        Random random=new Random();
        int number=random.nextInt(100)+1;
        Scanner input=new Scanner(System.in);

        while (true){
            System.out.println("please input your number!:");
            int guess=input.nextInt();
            if (guess<number){
                System.out.println("small");
                continue;
            }
            else  if (guess>number){
                System.out.println("big");
                continue;
            }
           if (guess==number){
               break;
           }
        }
        System.out.println("correct!");
        /*while (guess!=number){
            System.out.println("please input your number!:");
            guess=input.nextInt();
            if (guess<number){
                System.out.println("small");
               // continue;
            }
            else  if (guess>number){
                System.out.println("big");
                //continue;
            }
        }
        System.out.println("correct!");*/
    }
}
