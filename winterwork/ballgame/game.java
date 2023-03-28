package winterwork.ballgame;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//双色球游戏！

public class game {
    public static void main(String[] args) {
        int[] red,redrd=new int[6];
        //int[] redrd=new int[6];
        int[] bule,bulerd=new int[1];
        //int[] bulerd=new int[1];
        redrd=redball();
        bulerd=buleball();
        System.out.println("开奖红球码为："+ Arrays.toString(redrd));
        System.out.println("开奖蓝球码为："+ Arrays.toString(bulerd));
        System.out.println("请选择你的红球码！：");
        red=buyred();
        System.out.println("请选择你的蓝球码！：");
        bule=buybule();
        print(red,bule);
        int winbule=compare(bule,bulerd);
        int winred=compare(red,redrd);
        System.out.println("你抽中了"+winred+"个红球,"+"抽中了"+winbule+"个蓝球！");
        System.out.print("你赢取的奖金为：");
        money(winred,winbule);
    }



    public static int[] redball(){
        Random random=new Random();
        int[] redarr=new int[6];
        boolean boo=true;
        for (int i = 0; i < redarr.length;) {
            int rd=random.nextInt(33)+1;
            for (int j = 0; j < i; j++) {
                if (redarr[j]==rd){
                    boo=false;
                }
            }
            if (boo){
                redarr[i]=rd;
                i++;
            }
        }
        return redarr;
    }
    public static int[] buleball(){
        Random random=new Random();
        int[] bulearr=new int[1];
        int rd=random.nextInt(16)+1;
        bulearr[0]=rd;
        return bulearr;
    }

    public static int[] buyred(){
        int[] arr=new int[6];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("请输入你要购买的"+(i+1)+"个红球号码：");
            int k=scanner.nextInt();
            arr[i]=k;
        }
        return arr;
    }

    public static int[] buybule(){
        int[] arr=new int[1];
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你要购买的蓝球号码：");
        int k=scanner.nextInt();
        arr[0]=k;
        return arr;
    }

    public static int compare(int[] arr1,int[] arr2){
        int count=0;
        for (int i = 0; i < arr1.length; i++) {
            for (int i1 = 0; i1 < arr2.length; i1++) {
                if (arr1[i]==arr2[i1]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void print(int[] red,int[] bule){
        System.out.println("您购买的红球码为："+ Arrays.toString(red));
        System.out.println("您购买的蓝球码为："+ Arrays.toString(bule));
    }

    public static void money(int red,int bule){
        switch (red){
            case 0:
            case 1:
                if (bule==1){
                    System.out.println("5元");
                }
                if (bule==0){
                    System.out.println("0元");
                }
                break;
            case 2:
            case 3:
                if (bule==1){
                    System.out.println("10元");
                }
                if (bule==0){
                    System.out.println("0元");
                }
                break;
            case 4:
                if (bule==1){
                    System.out.println("200元");
                }
                if (bule==0){
                    System.out.println("10元");
                }
                break;
            case 5:
                System.out.println("3000元");
                break;
            case 6:
                if (bule==1){
                    System.out.println("1000w");
                }
                else {
                    System.out.println("500w");
                }
                break;
        }
    }
}
