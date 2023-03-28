package winterwork.Stringwork;
//用String方法来创建验证码


import java.util.Random;

public class Stringfcode {
    public static void main(String[] args) {
        String data="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random rd=new Random();
        StringBuilder c= new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int index= rd.nextInt(data.length());
            char ch= data.charAt(index);
            c.append(ch);
        }
        System.out.println(c);
    }
}
