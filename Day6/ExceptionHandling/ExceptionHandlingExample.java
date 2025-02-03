package Day6.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=0;
        int num2=0;
        try {
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            int ans=num1/num2;

        }
        catch (InputMismatchException e){
            System.out.println("Error : Please enter valid integers.");
        }
        catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed");
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }

    }
}
