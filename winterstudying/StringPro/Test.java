package winterstudying.StringPro;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String rusername="teru";
        String rpassword="123456";
        Scanner user=new Scanner(System.in);
        System.out.println("please input your username:");
        String username =user.next();
        System.out.println("please input your password");
        String password=user.next();
        /*if (username==rusername&&password==rpassword){
            System.out.println("welcome!");
        }
        else {
            System.out.println("wrong!");
        }
        此处必定输出wrong，因为
        rusername与rpassword均是常量在常量池中
        scanner输入的username与password均在堆内存
        而=号比较的是地址，二者地址不同，必定输出为wrong！
        */
        if(username.equals(rusername)&&password.equals(rpassword)){
            System.out.println("welcome!");
        }
        else{
            System.out.println("wrong!");
        }

        //验证码，满足大小写均可以
        String code="12abD";
        String code1="12ABd";
        System.out.println(code1.equals(code));//精确比较！
        System.out.println(code1.equalsIgnoreCase(code));//忽略大小写比较！
    }
}
