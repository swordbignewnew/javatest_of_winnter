package winterstudying.operation;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        int a=98;
        String s=a>=60 ? "考试通过" : "考试不通过";
        System.out.println(s);
        int b,c,d;
        b=10;
        c=20;
        d=15;
        int max1= b>c ? b : c;
        int max2=max1>d ? max1 : d;
        System.out.println(max2);
        System.out.println(Math.max(max1,d));
        System.out.println("--------------------");
        Scanner e= new Scanner(System.in);
        System.out.println("please input you lucknumber!");
        int age = e.nextInt();
        System.out.println(age);
    }
}
