package Day8;

import java.util.Arrays;

public class GreaterElement {
    static void nearestGreater(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                arr[i]=-1;
            }
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]<arr[j]){
                    arr[i]=arr[j];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 10};
        nearestGreater(nums);
    }
}
