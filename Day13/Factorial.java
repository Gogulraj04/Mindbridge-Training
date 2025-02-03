package Day13;

public class Factorial {
    public static int fact(int n) {
        if(n<0){
            throw new IllegalArgumentException("negative numbers");
        }
        if(n==1||n==0) {
            return n;
        }
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(fact(0));
        System.out.println(fact(10));
        System.out.println(fact(1));
        System.out.println(fact(-1));

    }
}
