package winterstudying.switchchoose;

import java.util.Scanner;
//switch只能做值匹配!
public class switchc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input your score!:");
        int score=input.nextInt();
        switch (score){
            case 90:
                System.out.println("your grade is A!");
                break;
            case 80:
                System.out.println("your grade is B!");
                break;
            case 0:
                System.out.println("your grade is C!");
                break;
        }
    }
}
