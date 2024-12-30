package Day3;

public class Largest_Smallest {
    static void largeAndSmall(int[] arr){
        int small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println("The smallest value in the array is : "+small);
        System.out.println("The Largest value in the array is : "+large);
    }
    public static void main(String[] args){
        largeAndSmall(new int[] {2,8,5,8,3});
    }
}
