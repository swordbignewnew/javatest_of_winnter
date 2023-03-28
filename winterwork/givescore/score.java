package winterwork.givescore;

public class score {
    public static void main(String[] args) {
        int[] arr={100,90,0,87,95,76};
        cal(arr);
    }
    public static void cal(int[] arr){
        int max=arr[0];
        int min=arr[0];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            max= Math.max(max,arr[i]);
            min= Math.min(min,arr[i]);
            sum+=arr[i];
        }
        sum=sum-max-min;
        System.out.println("最高分为："+max+"最低分为："+min);
        System.out.println("去高低后平均分为："+sum/4);
    }
}
