package Day2.BitwiseOperator;

public class Swap {
    static void swap(int n1,int n2) {
        n1=n1^n2;
        n2=n2^n1;
        n1=n2^n1;
        System.out.print("After swap :"+n1 +" "+n2);

    }
    public static void main(String[] args) {
        swap(5,10);
        int n=5;
        System.out.println();
    }
}
