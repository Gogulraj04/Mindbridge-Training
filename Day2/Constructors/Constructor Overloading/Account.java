package Day2.Constructors;

class Account {
    long accountNumber;
    double balance;

    Account(){
        this.accountNumber=0;
        this.balance=0.0;
    }
    Account(long accountNumber){
        this.accountNumber=accountNumber;
        this.balance=0.0;
    }
    Account(long accountNumber,double balance){
        this.balance=balance;
        this.accountNumber=accountNumber;
    }
    public void display(){
        System.out.println("Account Number :"+accountNumber);
        System.out.println("Balance :"+balance);
    }
}
class BankEmployee{
    public static void main(String[] args){
        Account obj1=new Account(987654321);
        Account obj2=new Account(987634560,600000);
        Account obj3=new Account();
        obj1.display();
        obj2.display();
        obj3.display();

    }
}
