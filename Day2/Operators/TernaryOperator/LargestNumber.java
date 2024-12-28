package Day2.TernaryOperator;

public class LargestNumber {
    static int large(int n1,int n2,int n3) {
        return n1>n2 ? (n1>n3) ? n1:n3 : (n2>n3) ? n2:n3 ;

    }
    public static void main(String[] args) {
        System.out.print(large(85,137,99));
    }
}
