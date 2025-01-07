package Day8;

public class LongestSubarraySum {
    static int findLongestSubArraySum(int[] arr){
        int max=0;
        int len=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            int count=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                count++;
                if(sum>max){
                    max=sum;
                    len=count;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(findLongestSubArraySum(nums));

    }
}
