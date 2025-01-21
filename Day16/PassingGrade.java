package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class PassingGrade {
    public static void findPass(List<Student> students,Predicate predicate){
        System.out.println("Passed Students :");
        students.forEach(student -> {
            if(predicate.test(student)){
                System.out.println(student.getName() +" -> "+student.getGrade());
            }
        });
        System.out.println("-----------------------");
    }
    public static void findFail(List<Student> students,Predicate predicate){
        System.out.println("Failed Students :");
        students.forEach(student -> {
            if(predicate.test(student)){
                System.out.println(student.getName() +" -> "+student.getGrade());
            }
        });
    }
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("gogul",52));
        students.add(new Student("ganesh",79));
        students.add(new Student("preethi",65));
        students.add(new Student("asif",60));
        students.add(new Student("shyam",94));
        students.add(new Student("vishnu",59));
        students.add(new Student("mohan",98));

        Predicate<Student> pass=(std) -> std.getGrade()>=60;
        Predicate<Student> fail=(std) -> std.getGrade()<60;
        findPass(students,pass);
        findFail(students,fail);
    }
}
