package Day2.AdditionalChallenges;

import java.util.HashMap;
import java.util.Scanner;
class Bank{
    long accountNumber;
    String accountName;
    double balance;

    Bank(long accountNumber,String accountName){
        this.accountNumber=accountNumber;
        this.accountName=accountName;
        this.balance=0;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public String getAccountName(){
        return accountName;
    }
    public void deposite(double amount){
        if(amount<0){
            System.out.println("Enter amount greater than 0.");
        }else{
            balance+=amount;
            System.out.println(amount+" Amount deposited successfully");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<balance){
            balance-=amount;
            System.out.println(amount+" Amount withdraw successfully");
            System.out.println("Your available balance :"+balance);
        }else{
            checkBalance();
            System.out.println("Enter valid amount");
        }
    }
    public void checkBalance(){
        System.out.println("Your account balance : "+balance);
    }
    public void displayDetails(){
        System.out.println("Account Number :"+accountNumber);
        System.out.println("Account Name :"+accountName);
        System.out.println("Balance :"+balance);
    }
}
public class BankingSystem {
    static Scanner sc=new Scanner(System.in);
    static HashMap<Long,Bank> mapp=new HashMap<>();

    public static void accountOpening(){
        System.out.println("Enter Account number : ");
        long accountNumber=sc.nextLong();
        sc.nextLine();
        if(mapp.containsKey(accountNumber)){
           System.out.println("Account number already exists");
           return;
        }
        System.out.println("Enter account name : ");
        String name=sc.nextLine();
        Bank account=new Bank(accountNumber,name);
        mapp.put(accountNumber,account);
        System.out.println("Acount created sucessfully..!!");
    }

    public static void deposite(){
        System.out.println("Enter Account number : ");
        long accountNumber=sc.nextLong();
        Bank account=mapp.get(accountNumber);
        if(account !=null){
            System.out.println("Enter amount to deposite : ");
            double amount=sc.nextDouble();
            account.deposite(amount);
        }else{
            System.out.println("Account not found");
        }
    }

    public static void withdraw(){
        System.out.println("Enter Account number : ");
        long accountNumber=sc.nextLong();
        Bank account=mapp.get(accountNumber);
        if(account !=null){
            System.out.println("Enter amount to withdraw : ");
            double amount=sc.nextDouble();
            account.withdraw(amount);
        }else{
            System.out.println("Account not found");
        }
    }
    public static void checkBalance(){
        System.out.println("Enter account number");
        long accountNumber=sc.nextLong();
        Bank account=mapp.get(accountNumber);
        if(account!=null){
            account.checkBalance();
        }else{
            System.out.println("Account not found");
        }
    }
    public static void displayAccountDetails(){
        System.out.println("Enter account number");
        long accountNumber=sc.nextLong();
        Bank account=mapp.get(accountNumber);
        if(account!=null){
            System.out.println("------------Your Account details------------");
            account.displayDetails();
        }else{
            System.out.println("Account not found");
        }
    }
    public static void main(String[] args){

        System.out.println("Welcome to maze bank");

        while(true){
            System.out.println("Services");
            System.out.println("1. Account opening");
            System.out.println("2. Deposite");
            System.out.println("3. Withdraw");
            System.out.println("4 .Check Balance");
            System.out.println("5. Display Account details");
            System.out.println("6. Exit");
            System.out.println("Enter your services");
            int choice =sc.nextInt();

            switch (choice){
                case 1:
                    accountOpening();
                    break;

                case 2:
                    deposite();
                    break;

                case 3:
                    withdraw();
                    break;

                case 4:
                    checkBalance();
                    break;
                case 5:
                    displayAccountDetails();
                    break;

                case 6:
                    System.out.println("Thank You Visit Again...!!");
                    return;

                default:
                    System.out.println("Please enter valid services");
            }
        }

    }

}
