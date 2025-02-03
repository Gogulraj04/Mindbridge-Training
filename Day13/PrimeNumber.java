package Day13;

public class PrimeNumber {
    public static boolean isPrime(long n) {
        if(n<=1) {
            return false;
        }

        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(3));
        System.out.println(isPrime(-1));
        System.out.println(isPrime(8));
        System.out.println(isPrime(5));
    }
}
