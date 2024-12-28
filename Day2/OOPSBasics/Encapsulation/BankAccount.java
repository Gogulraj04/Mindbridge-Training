package Day2.OOPSBasics;
//Write a class BankAccount with private attributes for accountNumber and balance.
// Provide public methods to deposit, withdraw, and check the balance.

import java.util.Scanner;

class BankAccount {
    private long accountNumber;
    private double balance;
    BankAccount(long accNumber){
        this.accountNumber=accNumber;
        balance=0;
    }
    public void deposite(double amount){
        balance+=amount;
        System.out.println(amount+" deposited successfully");
    }
    public void withdraw(double amount){
        balance-=amount;
        System.out.println(amount+" withdraw successfully");
    }
    public double balance(){
        return balance;
    }
}
class Bank extends BankAccount{
    Bank(long accNumber) {
        super(accNumber);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("---------------<<<<<<< WELCOME TO BANK >>>>>>>>---------------");
        System.out.println("Enter your Account Number");
        long accNum= sc.nextLong();
        BankAccount obj1=new BankAccount(accNum);
        System.out.println("Services :");
        System.out.println("1 -> Deposit");
        System.out.println("2 -> Withdraw");
        System.out.println("3 -> Check Balance");
        System.out.println("0 -> Exit");

        double amount=0;

        while(true){
            System.out.println("Enter the service :");
            int choice =sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter deposite amount :");
                    amount=sc.nextDouble();
                    obj1.deposite(amount);
                    break;

                case 2:
                    System.out.println("Enter withdraw amount :");
                    amount=sc.nextDouble();
                    obj1.withdraw(amount);
                    break;

                case 3:
                    System.out.println(obj1.balance());
                    break;

                case 0:
                    System.out.println("Thank You...!");
                    break;

                default:
                    System.out.println("please enter valid input....?");
                    break;
            }
            if(choice==0){
                break;
            }
        }
    }
}
