package Day17;

import java.util.Random;
import java.util.function.Supplier;

public class RandomSupplier {
    public static void main(String[] args) {
        Supplier<Integer> supplier=()-> new Random().nextInt(100);
        for (int i = 0; i < 5; i++) {
            System.out.println(supplier.get());
        }
    }
}
