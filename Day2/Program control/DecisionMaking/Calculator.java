package Day2.DecisionMaking;

import java.util.Scanner;

public class Calculator {
    static double add(double n1,double n2) {
        return n1+n2;
    }
    static double sub(double n1,double n2) {
        return n1-n2;
    }
    static double mul(double n1,double n2) {
        return n1*n2;
    }
    static double div(double n1,double n2) {
        return n1/n2;
    }
    static double mod(double n1,double n2) {
        return n1%n2;
    }
    public static void main(String[] args) {
        double num1=4;
        double num2=5;
        Scanner sc=new Scanner(System.in);
        String choice=sc.next();
        switch(choice) {
            case "add":
                System.out.print(add(num1,num2));
                break;

            case "subtraction":
                System.out.print(sub(num1,num2));
                break;

            case "multiplication":
                System.out.print(mul(num1,num2));
                break;

            case "division":
                System.out.print(div(num1,num2));
                break;

            case "modulus":
                System.out.print(mod(num1,num2));
                break;

            default:
                System.out.println("Please give valid input...");
                break;
        }

    }
}
