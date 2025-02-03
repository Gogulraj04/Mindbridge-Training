package Day16;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        BiConsumer<Integer,Integer> add=(n1,n2) -> System.out.println(n1+n2);
        add.accept(num1,num2);
        add.accept(num1,num1);

    }
}
