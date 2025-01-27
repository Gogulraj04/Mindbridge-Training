package Day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private List<Integer> marks;
    private char grade;
    private String department;

    public Student() {

    }

    public Student(String name, List<Integer> marks, String department) {
        this.name = name;
        this.marks = marks;
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setGrade(double avg) {
        if(avg>=90) grade='A';
        else if (avg>=80) grade='B';
        else if (avg>=70) grade='C';
        else if (avg>=50) grade='D';
    }

    public char getGrade() {
        return grade;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getAverage() {
        return marks.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public String toString(){
        return "Name : "+name+"\n"+"Department : "+department+"\n"+"Average Mark : "+getAverage()+"\n"+"Grade : "+grade;
    }

}
class Performance{
    public static void analyzePerformance(List<Student> students) {
        System.out.println("------------- Top 3 ------------------");
        students.forEach(student -> {
            double avg=student.getAverage();
            student.setGrade(avg);
        });
        students.stream().sorted(Comparator.comparingDouble(Student::getAverage).reversed())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("------------------------------------------------------------");
        System.out.println("--------- Department's Average --------");
        students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment,
                        Collectors.averagingDouble(Student::getAverage)
                ))
                .forEach((dept, avg) ->
                        System.out.printf("%s: %.2f%n", dept, avg)
                );
        System.out.println("------------------------------------------------------------");
        System.out.println("---------- Department's Top Student -----------");
        students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Student::getAverage))
                ))
                .forEach((dept, topStudent) ->
                        System.out.println(dept + ": " + topStudent.orElse(null))
                );

        System.out.println("------------------------------------------------------------");
        System.out.println("------------ Failed Student in each Department -------------");
        students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment,
                        Collectors.filtering(s -> s.getAverage() < 50, Collectors.counting())
                ))
                .forEach((dept, count) ->
                        System.out.printf("%s: %d%n", dept, count)
                );
    }
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student("gogul", Arrays.asList(78,98,76,90,65),"CS"));
        studentList.add(new Student("rohan", Arrays.asList(91,84,70,86,61),"PHY"));
        studentList.add(new Student("vimal", Arrays.asList(61,59,80,77,69),"MAT"));
        studentList.add(new Student("sharmi", Arrays.asList(90,92,95,89,98),"CS"));
        studentList.add(new Student("preethi", Arrays.asList(81,76,69,75,82),"PHY"));
        studentList.add(new Student("asif", Arrays.asList(65,73,70,88,90),"MAT"));
        studentList.add(new Student("shyam", Arrays.asList(90,85,76,69,52),"CS"));
        studentList.add(new Student("praveen", Arrays.asList(49,45,39,50,65),"PHY"));

        analyzePerformance(studentList);
    }

}