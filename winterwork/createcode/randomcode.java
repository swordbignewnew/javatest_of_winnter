package winterwork.createcode;

import java.util.Random;
//创建随机验证码！


public class randomcode {
    public static void main(String[] args) {
        System.out.println(code(6));;
    }
    public static String code(int length){
        Random random=new Random();
        String arrary="";
        for (int i = 0; i < length; i++) {
            int rd=random.nextInt(3);
            switch (rd){
                case 0:
                    int ch= random.nextInt(10);
                    arrary+=ch;
                    break;
                case 1:
                    char ch1= (char) (random.nextInt(26)+65);
                    arrary+=ch1;
                    break;
                case 2:
                    ch1=(char) (random.nextInt(26)+97);
                    arrary+=ch1;
                    break;
            }
        }
        return arrary;
    }
}
