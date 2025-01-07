package Day8;

import java.util.Arrays;

public class K_RotatedArray {
    static void rotate(int[] arr,int k){
        for(int i=0;i<k;i++){
            int store=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=store;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums,k);

    }
}
