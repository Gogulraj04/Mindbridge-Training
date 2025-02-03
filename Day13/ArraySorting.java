package Day13;

import java.util.Arrays;

public class ArraySorting {
    public static String sorting(int[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=i;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return Arrays.toString(arr);
    }
    public static void main(String[] args) {

        System.out.println(sorting(new int[] {5,3,4,1,2}));
        System.out.println(sorting(new int[] {5,3,4,4,1,2}));
        System.out.println(sorting(new int[] {1,2,3,4,5}));
        System.out.println(sorting(new int[] {}));

    }
}
