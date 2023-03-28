package winterwork.secret;

import java.util.Arrays;
//对数组元素进行加密
public class creatsecret {
    public static void main(String[] args) {
        int[] m={8,3,4,6};
        create(m);
    }
    public static void create(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=5;
            arr[i]%=10;
        }
        int temp;
        for (int i = 0; i < arr.length/2; i++) {
            temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
