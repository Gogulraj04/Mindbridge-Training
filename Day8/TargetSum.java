package Day8;

import java.util.Arrays;

public class TargetSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum=nums[i]+nums[j];
                if(target==sum){
                    result[count++]=i;
                    result[count++]=j;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target = 9;
        int[] ans=twoSum(nums,target);
        System.out.println(Arrays.toString(ans));
    }
}
