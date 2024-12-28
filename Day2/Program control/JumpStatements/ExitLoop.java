package Day2.JumpStatements;

import java.util.Scanner;

public class ExitLoop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(true){
                System.out.println("The number is :"+num);
                num=sc.nextInt();
                if(num==0){
                    System.out.println("You entered 0 ..!");
                    break;
                }
        }
    }
}
