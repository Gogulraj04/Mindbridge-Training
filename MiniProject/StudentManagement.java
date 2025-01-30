package MiniProject;

import java.util.Scanner;

public class StudentManagement {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("------------ Student Management System \uD83E\uDD0D -----------");
        ClassAdvisor advisor=new ClassAdvisor();
        System.out.println("If you want to retrive old data type \'yes\' or type \'no\' to continue");
        if(sc.nextLine().equals("yes")){
            advisor.retriveStudent();
        }
        while (true){
            System.out.println("--------------------------");
            System.out.println("1. Create Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Specfic Student");
            System.out.println("5. Display All Student's");
            System.out.println("6. Retrive file from JSON");
            System.out.println("7. Others ->(sort and filter)");
            System.out.println("0. Exit");
            System.out.println("--------------------------");

            System.out.println("Enter choice (0 to 6):");
            int choice=sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("--------------------------");
                    advisor.createStudent();
                    System.out.println("--------------------------");
                    break;

                case 2:
                    System.out.println("--------------------------");
                    System.out.print("Enter Student ID to UPDATE : ");
                    advisor.updateStudent(sc.nextInt());
                    System.out.println("--------------------------");
                    break;

                case 3:
                    System.out.println("--------------------------");
                    System.out.println("DELETE Student data");
                    advisor.deleteStudent();
                    System.out.println("--------------------------");
                    break;

                case 4:
                    System.out.println("--------------------------");
                    System.out.println("DISPLAY Student details"+"\n"+"Enter Student ID to display details");
                    advisor.displaySpecificStudent(sc.nextInt());
                    System.out.println("--------------------------");
                    break;
                case 5:
                    System.out.println("--------------------------");
                    System.out.println("DISPLAY ALL Student Details");
                    advisor.display();
                    System.out.println("--------------------------");
                    break;

                case 6:
                    System.out.println("--------------------------");
                    System.out.println("Retriving from the JSON file!");
                    advisor.retriveStudent();
                    System.out.println("--------------------------");
                    break;

                case 7:
                    System.out.println("--------------------------");
                    System.out.println("Others!!!");
                    boolean exit=true;
                    while (exit){
                        System.out.println("1. Sort by Name"+"\n"
                                +"2. Sort by age"+"\n"
                                +"3. Filter by grade"+"\n"
                                +"0. Exit"+"\n");
                        System.out.print("Enter the choice :");
                        choice=sc.nextInt();
                        System.out.println("--------------------------");
                        switch (choice){
                            case 1:
                                advisor.sortByName();
                                break;

                            case 2:
                                advisor.sortByAge();
                                break;

                            case 3:
                                advisor.filterByGrade();
                                break;

                            case 0:
                                exit=false;
                                System.out.println("Back -> ");
                                break;

                            default:
                                System.out.println("❌ Enter valid choice!");
                        }

                    }
                    break;


                case 0:
                    System.out.println("\uD83D\uDE0A Exiting..!!");
                    System.out.println("--------------------------");
                    return;

                default:
                    System.out.println("--------------------------");
                    System.out.println("❌ Please Provide Valid choice -> (1 to 6)..!!");
                    System.out.println("--------------------------");
            }
        }
    }
}
