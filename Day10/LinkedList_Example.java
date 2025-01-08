package Day10;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedList_Example {
    static LinkedList<String> ll=new LinkedList<>();
    static Scanner sc=new Scanner(System.in);

    static void addTask(String task){
        ll.add(task);
        System.out.println("Task added successfully!");
    }
    static void removeTask(String task){
        if(ll.contains(task)){
            ll.remove(task);
            System.out.println("Task removed successfully!");
        }else{
            System.out.println("Task not found!");
        }
    }

    static void display(){
        if(ll.isEmpty()){
            System.out.println("Task is empty!");
        }else{
            ListIterator<String> itr=ll.listIterator();
            int count=1;
            System.out.println("----- Tasks -----");
            while(itr.hasNext()){
                System.out.println("Task "+count++ +" : " +itr.next());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to task manager");
        while(true){
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Display tasks");
            System.out.println("0. Exit");
            int choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter the task to add :");
                    String task= sc.nextLine();
                    addTask(task);
                    break;

                case 2:
                    System.out.println("Enter the task to remove :");
                    task=sc.nextLine();
                    removeTask(task);
                    break;

                case 3:
                    display();
                    break;

                case 0:
                    System.out.println("----- Exiting -----");
                    System.out.println("ThankYou!");
                    return;

                default:
                    System.out.println("Please enter valid input");
            }
        }
    }
}
