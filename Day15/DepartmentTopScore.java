package Day15;

import java.util.*;
import java.util.stream.Collectors;

class Students{
    private int id;
    private String name;
    private int marks;
    private String department;

    public Students(){

    }
    public Students(int id,String name,int marks,String department){
        this.id=id;
        this.name=name;
        this.marks=marks;
        this.department=department;
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

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String toString(){
        return "\n"+"Id : "+id+"\n"+"Name : "+name+"\n"+"Marks : "+marks+"\n";
    }
}
public class DepartmentTopScore {
    public static void findTopScorer(List<Students> students){
        students.stream().collect(Collectors.groupingBy(Students::getDepartment,
                Collectors.maxBy(Comparator.comparing(Students::getMarks))))
                .forEach((dept,top) -> System.out.println(dept+" : "+top.orElse(null)));

    }
    public static void main(String[] args) {
        List<Students> list=new ArrayList<>();
        list.add(new Students(101,"gogul",98,"CS"));
        list.add(new Students(102,"asif",89,"IT"));
        list.add(new Students(103,"shyam",90,"AIDS"));
        list.add(new Students(104,"preethi",99,"IT"));
        list.add(new Students(105,"praveen",96,"CS"));
        list.add(new Students(106,"vishnu",88,"AIDS"));
        list.add(new Students(107,"adams",78,"CS"));
        list.add(new Students(108,"pavi",80,"IT"));
        list.add(new Students(109,"mohan",91,"AIDS"));

        findTopScorer(list);
    }
}
