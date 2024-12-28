package Day2.JumpStatements;


//Write a program to print all numbers from 1 to 100, skipping multiples of 5 (use continue).
public class NotMultipleof5 {
    static void skip(int n){
        for(int i=1;i<=100;i++){
            if(i%n==0){
                System.out.println();
                continue;
            }
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args){
        skip(5);// it will be applicable to any table number.
    }

}
