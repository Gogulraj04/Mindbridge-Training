package MiniProject;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;
    private List<Integer> marks;
    private char grade;
    private String email;

    public Student() {}

    public Student(int id, String name, int age, List<Integer> marks, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks=marks;
        this.email = email;
        this.grade=calculateGrade(marks);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
        this.grade=calculateGrade(marks);
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade=grade;
    }

//    Calculate grade based on marks
    public static char calculateGrade(List<Integer> marks){
        double average=getAverage(marks);
        char grade='A';
        if(average>=90) grade='A';
        else if(average>=80) grade='B';
        else if(average>=70) grade='C';
        else if(average>=50) grade='D';
        return grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    Get the average of the marks
    public static double getAverage(List<Integer> marks){
        return marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID =" + id +"\n"+
                " NAME ='" + name + '\'' +"\n"+
                " AGE =" + age +"\n"+
                " MARKS =" + marks +"\n"+
                " GRADE ='" + grade +'\''+"\n"+
                " E-MAIL =" + email + '\'' +"\n"+
                '}';
    }
}
