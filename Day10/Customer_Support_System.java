package Day10;

import java.util.*;

public class Customer_Support_System {
    static private Queue<String> queue=new LinkedList<>();

    static void addCustomer(String name){
        queue.add(name);
        System.out.println("Customer added sucessfully!");
    }

    static void serveCustomer(int count){
        for(int i=0;i<count;i++){
            System.out.println("Serving : "+queue.poll());
        }
    }

    static void displayWaitingCustomer(){
        if(queue.isEmpty()){
            System.out.println("There are no customer waitng in the queue");
        }else {
            System.out.print("Waiting : ");
            System.out.println(queue);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Customer support system");
        while(true){
            System.out.println("1. Add customer");
            System.out.println("2. Serve customer");
            System.out.println("3. Display waiting customer");
            int choice=sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter the customer name to add : ");
                    String name= sc.nextLine();
                    addCustomer(name);
                    break;

                case 2:
                    System.out.println("Enter how many customer's to serve : ");
                    int count=sc.nextInt();
                    sc.nextLine();
                    serveCustomer(count);
                    break;

                case 3:
                    displayWaitingCustomer();
                    break;

                case 0:
                    System.out.println("Exiting!");
                    System.out.println("ThankYou!");
                    return;

                default:
                    System.out.println("Please enter valid input");
            }
        }
    }
}
