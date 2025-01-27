package Day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
    public static void task(List<Integer> list){
        list.stream().parallel().filter(num->num>50)
                .map(num1 ->num1*num1)
                .limit(10)
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(51, 45, 56, 60, 75, 53, 69, 98, 44, 55, 50, 73, 88);
        task(list);
    }
}
