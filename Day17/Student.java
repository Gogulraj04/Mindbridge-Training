package Day17;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;
    public int marks;

    public Student() {

    }
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void displayStudentDetails() {
        System.out.println("Name : "+this.name);
        System.out.println("Marks : "+this.marks);
        System.out.println("----------");
    }

    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("gogul",89));
        students.add(new Student("ganesh",78));
        students.add(new Student("asif",69));
        students.add(new Student("shyam",74));
        students.add(new Student("preethi",61));

        students.forEach((Student::displayStudentDetails));
    }
}