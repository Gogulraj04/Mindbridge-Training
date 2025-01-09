package Day10;

import java.util.*;

public class SetExample {
    private static Set<String> set=new HashSet<>();
    static void addSet(String name){
        set.add(name);
        System.out.println("Set added successfuly!");
    }

    static void checkSet(String name){
        if(set.contains(name)){
            System.out.println(name +" is present in the set");
        }else{
            System.out.println(name+" is not present in the set");
        }
    }

    static void display(){
        if(set.isEmpty()){
            System.out.println("Set is empty");
        }else{
            Iterator<String> itr=set.iterator();
            System.out.println("Name's :");
            while(itr.hasNext()){
                String i= itr.next();
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Set Operations");
        while(true){
            System.out.println("1. Add");
            System.out.println("2. check");
            System.out.println("3. Display");
            System.out.println("0. Exit");
            int choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter name to add : ");
                    String name=sc.nextLine();
                    addSet(name);
                    break;

                case 2:
                    System.out.println("Enter name to check : ");
                    name=sc.nextLine();
                    checkSet(name);
                    break;

                case 3:
                    display();
                    break;

                case 0:
                    System.out.println("Exiting");
                    System.out.println("ThankYou!");
                    return;

                default:
                    System.out.println("Please enter valsd input");
            }
        }
    }
}
