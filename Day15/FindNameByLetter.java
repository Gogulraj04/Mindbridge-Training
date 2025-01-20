package Day15;

import java.util.ArrayList;
import java.util.List;
class Student1{
    String name;
    public Student1(){

    }
    public Student1(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class FindNameByLetter {
    public static void findByLetter(List<Student1> student,char find){
        student.forEach(Student1 ->{
            if (Student1.getName().startsWith(String.valueOf(find))) {
                System.out.println(Student1.name);
            }
        });
    }
    public static void main(String[] args) {
        List<Student1> student=new ArrayList<>();
        student.add(new Student1("gogul"));
        student.add(new Student1("preethi"));
        student.add(new Student1("asif"));
        student.add(new Student1("shyam"));
        student.add(new Student1("praveen"));
        student.add(new Student1("mohan"));
        student.add(new Student1("vishnu"));
        student.add(new Student1("adams"));
        student.add(new Student1("vignesh"));
        student.add(new Student1("pavi"));
        student.add(new Student1("vasanth"));
        student.add(new Student1("mukilan"));
        findByLetter(student,'m');
    }
}
