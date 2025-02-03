package Day13;

public class Palindrome {
    public static boolean isPalindrome(int n){
        int ans=0;
        int num=n;
        while (num!=0){
            int dig=num%10;
            ans=ans*10+dig;
            num/=10;
        }
        if(n==ans){
            return true;
        }
        return false;
    }
    public static boolean isPalindrome(String s){
        if(s==null){
            throw new IllegalArgumentException("String can't be null");
        }
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        if(s.equals(sb.toString())){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("gogul"));
        System.out.println(isPalindrome("Madam"));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome(null));
        System.out.println(isPalindrome("g@gul"));
    }
}
