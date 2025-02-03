package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StringLength {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");

        ArrayList<Integer> result=new ArrayList<>();
        Function<String,Integer> length=(s) -> s.length();
//        for(String i:list){
//            result.add(length.apply(i));
//        }
        list.forEach(l -> result.add(length.apply(l)));
        System.out.println(result);
    }
}
