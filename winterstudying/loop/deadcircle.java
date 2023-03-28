package winterstudying.loop;

import java.util.Scanner;

public class deadcircle {
    public static void main(String[] args) {
//        while (true){
//            System.out.println("happy!");
//        }
        String keyword="a143067";
        Scanner input=new Scanner(System.in);
        /*System.out.println("please input your keyword!:");
        String i = input.next();
        while (!i.equals(keyword)){
            System.out.println("wrong!");
            System.out.println("please input your keyword!:");
            i = input.next();
        }
        System.out.println("correct!");*/
        while (true){
            System.out.println("please input your keyword!:");
            String i = input.next();
            if(i.equals(keyword)){
                System.out.println("correct!");
                break;
            }
            else {
                System.out.println("wrong!");
                continue;
            }
        }
    }
}
