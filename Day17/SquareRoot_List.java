package Day17;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.DoubleFunction;

public class SquareRoot_List {
    public static void main(String[] args) {
        SquareRoot_List obj=new SquareRoot_List();
        Random random=new Random();
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        DoubleFunction<Double> doubleFunction=Math::sqrt;
        list.forEach(integer -> System.out.println(doubleFunction.apply(integer)));

    }
}
