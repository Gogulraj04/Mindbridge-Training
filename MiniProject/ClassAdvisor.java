package MiniProject;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ClassAdvisor {

    public static Scanner sc=new Scanner(System.in);
    private static String FILE_NAME = "/Users/gogul/Documents/Training/Mindbridge Training/src/MiniProject/student.JSON";
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final File file=new File(FILE_NAME);
    private static Map<Integer,Student> studentMap=new TreeMap<>();

//    checks the email is vaild or not
    public static boolean checkEmail(String email){
        String pattern="^[a-zA-Z0-9][a-zA-Z0-9._-]*@[a-zA-Z0-9.-]+\\.(com|org|net)$";
        Pattern p=Pattern.compile(pattern);
        Matcher match= p.matcher(email);
        return match.matches();
    }

//    Create student details
    public static void createStudent(){
        System.out.println("CREATE Student");
        System.out.println("Enter Id, Name, Age, Marks for ( 5 subject's), and Email");
        try{
            System.out.print("Enter Student ID : ");
            int id= sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Student NAME : ");
            String name=sc.nextLine();
            System.out.print("Enter Student AGE : ");
            int age=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Student MARKS (5 subject's): ");
            List<Integer> marks=new ArrayList<>();
            int mark=0;
            for (int i = 1; i <= 5; i++) {
                System.out.print("Subject "+i+" : ");
                mark= sc.nextInt();
                marks.add(mark);

            }
            sc.nextLine();
            System.out.print("Enter Student E-MAIL : ");
            String email=sc.next();
            while (!checkEmail(email)){
                System.out.println("❌ Please enter valid E-MAIL Pattern!");
                email= sc.next();
            }
            Student student=new Student(id,name,age,marks,email);
            studentMap.put(id,student);
        }catch (Exception e){
            e.printStackTrace();
        }
        saveStudents();
        System.out.println("✅ Student created sucessfully!");
    }

//    Update student details
    public static void updateStudent(int id){
        if(studentMap.isEmpty()){
            System.out.println("❌ No Student data in the Map!!!");
            return;
        }
        Student students = studentMap.get(id);
        if (students == null) {
            System.out.println("Student ID not found!");
            return;
        }
        studentMap.forEach((search_id,student) ->{
            if(search_id.equals(id)){
                while (true){
                    System.out.print("Enter the choice that you want to update : "+"\n"
                            +"1. Update Student Name"+"\n"
                            +"2. Update Student Age" +"\n"
                            +"3. Update Student Marks"+"\n"
                            +"4. Update Student E-Mail"+"\n"
                            +"0. Exit"+"\n");
                    int choice= sc.nextInt();
                    sc.nextLine();
                    try {
                        switch (choice){
                            case 1:
                                System.out.print("Enter Name to update : ");
                                student.setName(sc.nextLine());
                                System.out.println("✅ Student Name updated sucessfully!");
                                break;

                            case 2:
                                System.out.print("Enter Age to update");
                                student.setAge(sc.nextInt());
                                System.out.println("✅ Student Age updated sucessfully!");
                                break;

                            case 3:
                                System.out.println("Enter Marks to update (5 subject's)");
                                List<Integer> updated_marks=new ArrayList<>();
                                int mark=0;
                                for (int i = 1; i <= 5; i++) {
                                    System.out.print("Subject "+i+" : ");
                                    mark=sc.nextInt();
                                    updated_marks.add(mark);
                                }
                                student.setMarks(updated_marks);
                                System.out.println("✅ Student Marks & Grade updated sucessfully!");
                                break;

                            case 4:
                                System.out.println("Enter E-Mail to update");
                                String updated_Email=sc.nextLine();
                                while (!checkEmail(updated_Email)){
                                    System.out.println("❌ Invalid E-Mail pattern please re-enter..!");
                                    updated_Email=sc.nextLine();
                                }
                                student.setEmail(updated_Email);
                                System.out.println("✅ Student E-Mail updated sucessfully!");
                                break;

                            case 0:
                                System.out.println("✅ Updation process completed..!");
                                saveStudents();
                                return;

                            default:
                                System.out.println("❌ Please enter valid input..!!");
                        }
                    } catch (Exception e) {
                        System.out.println("❌ Error for updating student details");
                    }
                }
            }else {
                System.out.println("❌ No Student data found!");
            }
        });
    }

//    Delete student details
    public static void deleteStudent(){
        if(studentMap.isEmpty()){
            System.out.println("❌ No Student data in the Map!!!");
            return;
        }
        while (true){
            System.out.println("Enter 0 to exit!");
            System.out.println("Enter Student ID to delete");
            int id=sc.nextInt();
            if(id==0) return;
            boolean remove=studentMap.entrySet().removeIf((entry -> entry.getKey().equals(id)));
            if(remove){
                System.out.println("Student ID : "+id +"deleted sucessfully!");
                saveStudents();
            }else {
                System.out.println("❌ Student not found!");
            }
        }
    }

//    Display student details by their ID
    public static void displaySpecificStudent(int id){
        Optional<Map.Entry<Integer, Student>> student = studentMap.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equals(id))
                .findFirst();

        if (student.isPresent()) {
            System.out.println(student.get());
        } else {
            System.out.println("❌ Student not found!");
        }

    }

//Display All Student's
    public static void display(){
        studentMap.forEach((id,student) ->{
            System.out.println(student);
        });
    }

//    Save student's details to the JSON file
    public static void saveStudents(){
        Thread t=new Thread(() ->{
            try{
                objectMapper.writerWithDefaultPrettyPrinter().writeValue(file,studentMap);
            }catch (IOException e){
                System.out.println("❌ Error for saving student's data into "+FILE_NAME+" "+e.getMessage());
            }
        });
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println("❌ Saving thread interrupted: " + e.getMessage());
        }

    }

//    Retrive student's data from the JSON file
    public static void retriveStudent(){
            try{
                if(!file.exists()){
                    System.out.println("❌ Not saved student data , Please save and retrive!");
                    return;
                }
                studentMap=objectMapper.readValue(file, new TypeReference<TreeMap<Integer, Student>>(){});
                if(studentMap.isEmpty()){
                    System.out.println("❌ No student data!");
                }
                System.out.println("✅ Data retrived..!");
            }catch (IOException e){
                System.out.println("❌ Error to load student data!"+e.getMessage());
            }
    }

//    Sort the Student's by name
    public static void sortByName(){
        studentMap.values().stream().sorted(Comparator.comparing(Student::getName))
                .forEach(System.out::println);
    }

//    Sort the Student's by age
    public static void sortByAge(){
        studentMap.values().stream().sorted(Comparator.comparing(Student::getAge))
                .forEach(System.out::println);
    }

//    Filter the Student's by grade
    public static void filterByGrade(){
        if (studentMap == null || studentMap.isEmpty()) {
            System.out.println("No students available!");
            return;
        }
        System.out.println("Enter the grade to filter");
        char filtergrade=sc.next().charAt(0);
        Predicate<Student> grades=student -> student.getGrade()==filtergrade;
        studentMap.values().stream().filter(grades).forEach(System.out::println);
    }
}
