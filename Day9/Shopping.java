package Day9;

import java.util.ArrayList;
import java.util.Scanner;

public class Shopping {
    static ArrayList<String> arr=new ArrayList<>();

    static void addItem(String item){
        arr.add(item);
        System.out.println("Item added successfully!");
    }

    static void removeItem(String item){
        arr.remove(item);
        System.out.println("Item removed successfully!");
    }

    static void display(){
        if(arr.isEmpty()){
            System.out.println("The list is empty");
        }else{
            int i=1;
            for(String s:arr){
                System.out.println("Item "+i+++" : "+s);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Manage shopping list");

        while(true){
            System.out.println("1. Add items in the list");
            System.out.println("2. Remove items in the list");
            System.out.println("3. Display the shopping list");
            System.out.println("0. Exit");

            int choice= sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter the items to add");
                    String item=sc.nextLine();
                    addItem(item);
                    break;

                case 2:
                    System.out.println("Enter the items to remove");
                    item=sc.nextLine();
                    if(arr.contains(item)){
                        removeItem(item);
                    }else{
                        System.out.println("Item not found!");
                    }
                    break;

                case 3:
                    display();
                    break;

                case 0:
                    System.out.println("Exiting");
                    System.out.println("ThankYou!");
                    return;

                default:
                    System.out.println("Please enter valid input");
            }
        }
    }
}
