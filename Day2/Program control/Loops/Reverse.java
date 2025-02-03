package Day2.Loops;

public class Reverse {
    static int reverse(int n) {
        int num=0;
        while(n!=0) {
            int dig=n%10;
            num=num*10+dig;
            n/=10;
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }

}
