package Day9;

import java.util.Scanner;
import java.util.Vector;

public class Student_Grades_Management_System {
    static Scanner sc=new Scanner(System.in);
    static Vector<Integer> vector=new Vector<>();

    static void addGrade(int strength){
        for(int i=0;i<strength;i++){
            vector.add(sc.nextInt());
        }
    }

    static void removeGrade(int index){
        vector.remove(index);
    }

    static void displayGrades(){
        System.out.println("The grades are..");
        for(int i:vector){
            System.out.println(i);
        }
    }

    static void calculate(){
        int highest=Integer.MIN_VALUE;
        int lowest=Integer.MAX_VALUE;
        int avg=0;
        for(int i:vector){
            if(i>highest){
                highest=i;
            }
            if(i<lowest){
                lowest=i;
            }
            avg+=i;
        }
        System.out.println("Highest grade is : "+highest);
        System.out.println("Lowest grade is : "+lowest);
        System.out.println("Average : "+(avg/vector.size()));
    }

    public static void main(String[] args) {
        System.out.println("---------- Student Grades Management System ----------");

        while(true){
            System.out.println("1. Add Grade");
            System.out.println("2. Remove Grade");
            System.out.println("3. Display Highest,Lowest and Average");
            System.out.println("4. Display all Grade");
            System.out.println("0. Exit..!");

            int choice= sc.nextInt();
            switch (choice){
                case 1:
                    int strength= sc.nextInt();
                    addGrade(strength);
                    break;

                case 2:
                    System.out.println("The index starts from 0");
                    int index=sc.nextInt();
                    removeGrade(index);
                    break;

                case 3:
                    calculate();
                    break;

                case 4:
                    displayGrades();
                    break;

                case 0:
                    System.out.println("---------- Exiting ----------");
                    System.out.println("Thank You..!");
                    return;

                default:
                    System.out.println("Please provide valid choice");
            }
        }
    }
}