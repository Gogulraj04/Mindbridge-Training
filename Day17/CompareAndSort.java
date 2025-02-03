package Day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareAndSort {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("gogul");
        list.add("ganesh");
        list.add("Pavithran");
        list.add("asif");
        list.add("Gogul");
        list.add("pavi");


        Collections.sort(list,String::compareToIgnoreCase);
        System.out.println(list);
    }
}
