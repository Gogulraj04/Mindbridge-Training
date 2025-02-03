package Day7.Exception_Part2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionP2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            int sum=num1/num2;

        }catch(InputMismatchException e){
            System.out.println("Invalid input. Please enter numeric values.");
        }
        catch (ArithmeticException e){
            System.out.println("Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("An error occurred: [error message].");
        }


    }
}
