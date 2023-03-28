package winterwork.findkeyword;

//寻找101-200之间的素数！
public class keyword {
    public static void main(String[] args) {
        int a=101;
        while (a<=200){
            int k=a/2+1;
            for (int i = 2; i < a; i++) {
                if (a%i==0){
                    break;
                }
                if (i>=k){
                    System.out.print(a+"\t");
                    break;
                }
            }
            a++;
        }
    }
}
