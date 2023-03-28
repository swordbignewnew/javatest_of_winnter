package winterstudying.arrary;

import java.util.Random;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        //数组最大值与求和
        /*int[] arr={1,2,3,4,5,69,8,7,9};
        int sum=0;
        int max=arr[0];
        for (int i = 0; i <arr.length; i++) {
            //System.out.println(arr[i]);
            sum+=arr[i];
            max=Math.max(max,arr[i]);
//            max=max > arr[i] ? max:arr[i];
        }
        System.out.println("总和为："+sum);
        System.out.println("最大值为："+max);*/


        //猜数字游戏
        /*定义flag为布尔变量进行简化，
        当输入到正确的数字，
        即更改flag的值为false，跳出循环即可！
        或者使用标识符，这里用了ot，告诉break打断何处循环
         */
        /*int[] arr=new int[5];
        Scanner scanner=new Scanner(System.in);
        Random random =new Random();
        for (int i = 0; i < 5; i++) {
           arr[i]= random.nextInt(20)+1;
        }
        int input;
        int k=0;
        boolean flag=true;
        OT:
        while (flag){
            System.out.println("please input the word you thought!:");
            input =scanner.nextInt();
            for (int i = 0; i < 5; i++) {
                if (arr[i]==input){
                    //flag=false;
                    System.out.println(i+"\t"+"correct!");
                    break OT;
                }
                else if(arr[i]!=input){
                    System.out.println("wrong");
                }
            }
        }
        for (int j = 0; j < 5; j++) {
            System.out.print(arr[j]+"\t");
        }*/



        //生成不重复的随机数，即对已排序的数字进行随机排序
        Random random=new Random();
        int[] arr=new int[5];
        int[] arr2=new int[5];
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input five words!:");
        for (int i = 0; i < 5; i++) {
            arr[i]=scanner.nextInt();
        }
        for (int i = 0; i < 5; ) {
            int rd=random.nextInt(5);
            boolean boo =true;
            for (int j = 0; j < i; j++) {
                if (arr2[j]==rd){
                    boo=false;
                }
            }
            if (boo){
                arr2[i]=rd;
                i++;
            }
        }
        for (int i = 0; i < 5; i++) {
            int temp=arr2[i];
            System.out.print(arr[temp]+"\t");
        }
    }
}
