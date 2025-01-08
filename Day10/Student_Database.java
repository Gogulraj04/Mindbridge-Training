package Day10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student_Database {
    static Map<String,Integer> mpp=new HashMap<>();

    static void addStudent(String name,int grade){
        mpp.put(name,grade);
        System.out.println("Student added successfully!");
    }

    static void updateStudent(String name,int grade){
        if(mpp.containsKey(name)){
            mpp.replace(name,grade);
        }else{
            System.out.println("Student is not in the database");
        }
    }

    static void retriveStudent(String name){
        if(mpp.containsKey(name)){
            System.out.println("Student name : "+name);
            System.out.println("Grade : "+mpp.get(name));
        }else{
            System.out.println("Student not found!");
        }
    }

    static void display(){
        System.out.println("----- Student Details -----");
        for(Map.Entry<String,Integer> i: mpp.entrySet()){
            System.out.println("Student name : "+i.getKey());
            System.out.println("Grade : "+i.getValue());
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Student Database");

        while(true){
            System.out.println("1. Add student and grade");
            System.out.println("2. Update student's grade");
            System.out.println("3. Retrive Student's grade");
            System.out.println("4. Display student");
            System.out.println("0. Exit");

            int choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter student name :");
                    String name=sc.nextLine();
                    System.out.println("Enter student grade :");
                    int grade=sc.nextInt();
                    sc.nextLine();
                    addStudent(name,grade);
                    break;

                case 2:
                    System.out.println("Enter the student name to update :");
                    name=sc.nextLine();
                    System.out.println("Enter the grade to update");
                    grade=sc.nextInt();
                    sc.nextLine();
                    updateStudent(name,grade);
                    break;

                case 3:
                    System.out.println("Enter student name to retrive :");
                    name=sc.nextLine();
                    retriveStudent(name);
                    break;

                case 4:
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
