package Day9;

import java.util.ArrayList;

public class Maximum {
    static Integer max(ArrayList<Integer> arr){
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(15);
        arr.add(22);
        arr.add(8);
        arr.add(42);
        arr.add(17);
        System.out.println(max(arr));
    }
}
