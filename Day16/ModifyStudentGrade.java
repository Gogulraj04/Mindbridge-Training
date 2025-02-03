package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ModifyStudentGrade {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("gogul",52));
        students.add(new Student("ganesh",79));
        students.add(new Student("preethi",65));
        students.add(new Student("asif",60));
        students.add(new Student("shyam",84));
        students.add(new Student("vishnu",59));
        students.add(new Student("mohan",88));

        Consumer<Student> modifiMark= student -> student.setGrade(student.getGrade()+10);
        students.forEach(modifiMark);
        students.forEach(student -> System.out.println(student));
    }
}
