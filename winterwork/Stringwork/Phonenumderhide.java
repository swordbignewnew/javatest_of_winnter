package winterwork.Stringwork;

import java.util.Scanner;

    //对输入的手机号码进行掩藏
    //eg：15079998779--》150****8779


public class Phonenumderhide {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please input your phone number!: ");
        String pn=sc.next();

        String ahead=pn.substring(0,3);
        String behind=pn.substring(7);

        String fi=ahead+"****"+behind;

        System.out.println("The number be handled is: ");
        System.out.println(fi);
    }
}
