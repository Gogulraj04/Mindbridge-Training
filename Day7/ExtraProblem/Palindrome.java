package ExtraProblem;

public class Palindrome {
//    static String reverse(String s){
//        String rev="";
//        int i=0;
//        int j=0;
//        for(i=0,j=s.length()-1;i<j;i++,j--){
//            ans=
//        }
//
//    }
    static boolean isPalindrome(String s){
        StringBuilder sb=new StringBuilder(s);
        if(s.equals(sb.reverse())){
            return true;
        }
        StringBuilder dummy;
        for (int i = 0; i <s.length(); i++) {
            if(i==0){
                dummy= new StringBuilder(s.substring(i + 1));
            }else if(i==s.length()-1){
                dummy= new StringBuilder(s.substring(0, s.length() - 1));
            }else{
                dummy= new StringBuilder(s.substring(0, i) + s.substring(i + 1, s.length()));
            }
            StringBuilder rev=new StringBuilder(dummy);
            rev.reverse();

            if(dummy.toString().equals(rev.toString())){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "cbab";
        System.out.println(isPalindrome(s));
    }
}
