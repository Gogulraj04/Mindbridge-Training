package Day9;

import java.util.*;
public class ReverseArrayList {
    static ArrayList<Integer> reverse(ArrayList<Integer> arr){
        for(int i=0;i<arr.size()/2;i++){
            Integer temp=arr.get(i);
            arr.set(i,arr.get(arr.size()-i-1));
            arr.set(arr.size()-i-1,temp);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println("Enter how many elements to add : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.println(reverse(arr));
    }
}
