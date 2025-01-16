package Day13;

public class StringReverse {
    static String reverse(String s){
        if(s==null){
            throw new IllegalArgumentException("String can't be null");
        }
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args){
        try{
            System.out.println(reverse("gogul"));
            System.out.println(reverse("Gogul"));
            System.out.println(reverse(""));
            System.out.println(reverse("g"));
            System.out.println(reverse(null));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
