package Day10;

import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class Stack_UndoFunctionality {
    static Stack<String> st=new Stack<>();

    static void push(String input){
        st.push(input);
        System.out.println("Input added to the text editor");
    }

    static void pop(){
        st.pop();
        System.out.println("Previously typed word is deleted");
    }

    static void display(){
        if(st.isEmpty()){
            System.out.println("Text editor is empty!");
        }else{
            ListIterator<String> itr= st.listIterator();
            while(itr.hasNext()){
                String i= itr.next();
                System.out.print(i+" ");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to text editor");

        while (true){
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. Display");
            System.out.println("0. Exit");

            int choice=sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("write :");
                    String input=sc.nextLine();
                    push(input);
                    break;

                case 2:
                    System.out.println("Delete the previously typed :");
                    pop();
                    break;

                case 3:
                    System.out.println("Display text editor :");
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
