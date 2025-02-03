package Day17;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class MaxTwo_BinaryOperator {
    public static void main(String[] args) {
        int num1=12;
        int num2=21;

        IntBinaryOperator binaryOperator=(number1, number2) -> (int)(Math.max(number1,number2));

        System.out.println(binaryOperator.applyAsInt(num1,num2));
    }
}
