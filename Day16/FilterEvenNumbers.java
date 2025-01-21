package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterEvenNumbers {
    public static ArrayList<Integer> filterEven(List<Integer> list, Predicate<Integer> predicate){
        ArrayList<Integer> result=new ArrayList<>();
        list.forEach(number ->{
            if(predicate.test(number)){
                result.add(number);
            }
        });
        return result;
    }
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(filterEven(list, (obj1) -> obj1%2==0));
    }
}
