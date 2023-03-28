package winterstudying.loop;

public class forcirle {
    public static void main(String[] args) {
//        for循环
        int sum=0;
        for (int i =0;i <=3; i++){
            System.out.println("happy");
        }
        System.out.println("----------------------");
        for(int i=1;i<=5;i++)
        {
            sum+=i;
        }
        int num=0;
        System.out.println(sum);
        System.out.println("-----------------------");
        for(int i=1;i<=10;i++){
            if (i%2!=0){
                num+=i;
            }
        }
        System.out.println(num);
        System.out.println("-----------------------");
        int k=0;
        for(int i=100;i<1000;i++){
            if((i/100)*(i/100)*(i/100)+(i/10%10)*(i/10%10)*(i/10%10)+(i%10)*(i%10)*(i%10)==i) {
                System.out.print(i+"\t");
                k += 1;
            }
        }
        System.out.println(k);
    }
}
