package winterstudying.method;

public class demo1 {
    public static void main(String[] args) {
       int c= sum(10,20);
        System.out.println(c);
        happy();
        System.out.println(cal(5));
        bool(0);
        int[] arr={1,2,3,4,5};
        int[] arr1={1,2,3,4,5};
        System.out.println(arrary(arr));
        arrary1(arr);
        int num=5;
        int bool=arrary2(num,arr);
        if(bool<=arr.length){
        System.out.println("输入元素"+num+"，返回索引:"+bool);
            System.out.println(check(arr1, arr));
        }
    }
//求和并返回
    public static int sum(int a, int b) {
        int sum =a +b;
        return sum;
    }
//    输出happy
    public  static void happy(){
        System.out.println("happy");
    }
//返回1——n的和
    public  static int cal(int a){
        int sum=0;
        for (int i = 0; i <= a; i++) {
            sum+=i;
        }
        return sum;
    }

//判断奇偶数
    public static void bool(int input){
        if (input%2==0){
            System.out.println("偶数！");
        }
        else {
            System.out.println("奇数!");
        }
    }


//数组最大值
    public static int arrary(int[] arr){
        int temp=arr[0];
        for (int i = 1; i < arr.length-1; i++) {
            temp=Math.max(arr[i],arr[i+1]);
        }
        return temp;
    }


//输出整形数组
    public static void arrary1(int [] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+"，");
        }
        System.out.print(arr[arr.length-1]);
        System.out.println("]");
    }


//输入数字在数组进行索引并返回索引值，若无返回wrong
    public static int arrary2(int num,int[] arr){
        int count=1;
        for (int i = 0; i < arr.length; i++) {
            if (num==arr[i]){
                count=i;
                break;
            }
            if (count==arr.length){
                System.out.println("wrong");
                count++;
            }
            count++;
        }
        return count;
    }
    
//判断两个数组是否相等
    public static boolean check(int[] arr1,int[] arr2){
        if(arr2.length==arr1.length){
            for (int i = 0; i < arr1.length; i++) {
                if (arr2[i]!=arr1[i]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

