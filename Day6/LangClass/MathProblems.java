package Day6.LangClass;

public class MathProblems {
    public static void main(String[] args) {
        //Using Math
        int num1=5;
        int num2=6;

        System.out.println("The Square root of the Number one is : "+Math.sqrt(num2));
        System.out.println("The Power of the two numbers is : "+Math.pow(num1,num2));
        System.out.println("The Maximum of tow number is : "+Math.max(num1,num2));

        //String
        String s="gogul";
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.substring(2,5));

        //System
        long start=System.currentTimeMillis();
        long startNano=System.nanoTime();
        for(int i=1;i<=500000;i++){

        }
        long stop=System.currentTimeMillis();
        long stopNano=System.nanoTime();

        System.out.println("The execution time of the particular session in millisecond is :"+(stop-start));
        System.out.println("The execution time of the particular session in nanosecond is :"+(stopNano-startNano));



    }
}
