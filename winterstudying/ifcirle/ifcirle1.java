package winterstudying.ifcirle;

import java.util.Scanner;

public class ifcirle1 {
    public static void main(String[] args) {
        int  rateheart;
        Scanner input=new Scanner(System.in);
        System.out.println("please input your heartrate!");
        rateheart=input.nextInt();
        if (rateheart>=60&rateheart<=100)
        {
            System.out.println("you do not have problem");
        }
        else{
            System.out.println("you should see the doctor");
        }
    }
}
