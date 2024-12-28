package Day2.Operators.ArithmeticandLogicalOperators;

public class Prime {
    static boolean isPrime(int n) {
        int count=1;
        if(n==1||n==2) {
            return true;
        }

        for(int i=2;i<=n/2;i++) {
            if(n%i==0) {
                count++;
            }
        }
        if(count>1) {
            return false;
        }
        else {
            return true;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPrime(19));
    }
}
