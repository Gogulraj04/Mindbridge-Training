package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FindWithStartingLetter {
    public static void findName(List<String> list, Predicate<String> predicate){
        ArrayList<String> result=new ArrayList<>();
        list.forEach(name -> {
            if(predicate.test(name)){
                result.add(name);
            }
        });
        System.out.println(result);
    }
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Apple");
        list.add("Avacado");
        list.add("Banana");
        list.add("Cherry");

        String letter="A";
        findName(list,(listOne) -> listOne.startsWith(letter));
    }
}
