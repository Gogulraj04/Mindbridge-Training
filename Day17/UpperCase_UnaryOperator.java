package Day17;

import java.util.function.UnaryOperator;

public class UpperCase_UnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator=(s -> s.toUpperCase());
        System.out.println(unaryOperator.apply("gogul"));
    }
}
