package Day8;

import java.util.Arrays;

public class MissingElement {
    static int check(int[] arr){
        Arrays.sort(arr);
        int missing=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=missing){
                return missing;
            }else{
                missing+=1;
            }
        }
        return missing;
    }
    public static void main(String[] args) {
        int[] nums = {3,9,1,2,4,5,6,7,8};
        System.out.println(check(nums));

    }
}
