package winterwork.copy;

import java.util.Arrays;

//数组元素的复制;
//不能直接arr1=arr2;
//这样子是地址的复制；
public class copyshuzu {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(copy(arr)));
    }
    public static int[] copy(int[] arr){
        int[] arr2=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i];
        }
        return arr2;
    }
}
