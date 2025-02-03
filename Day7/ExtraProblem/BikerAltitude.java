package ExtraProblem;

import java.util.Arrays;

public class BikerAltitude {
    static int highestAltitude(int[] arr){
        int max=0;
        int[] ans=new int[arr.length+1];
        ans[0]=0;
        for(int i=1;i<ans.length;i++){
            ans[i]=+ans[i-1]+arr[i-1];
            if(ans[i]>max){
                max=ans[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(highestAltitude(gain));

    }
}
