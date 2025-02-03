package Day5.AutoboxingandVarargs;

public class Varargs {
    static int numbers(int... numbers){
        int sum=0;
        for(int i:numbers){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(numbers(1,2,3,4,5));
        System.out.println(numbers(1,2,3,4,5,6,7,8,9,10));
        System.out.println(numbers(1,2));
        System.out.println(numbers());
    }
}
