package Day15;

import java.util.HashMap;
import java.util.Map;
class Student{
    int id;
    String std_name;
    int marks;

    public Student(){

    }

    public Student(int id,String name,int marks){
        this.id=id;
        this.std_name=name;
        this.marks=marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStd_name() {
        return std_name;
    }

    public void setStd_name(String std_name) {
        this.std_name = std_name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString(){
        return "Student: "+std_name.toUpperCase();
    }
}
public class TransformListOfNames {
    public static void transformUpper(Map<Integer,Student> map){
        for(Map.Entry<Integer,Student> entry: map.entrySet()){
            System.out.println(entry.getValue());
        }
    }
    public static void main(String[] args) {
        Map<Integer,Student> map=new HashMap<>();
        map.put(1,new Student(101,"gogul",87));
        map.put(2,new Student(102,"preethi",98));
        map.put(3,new Student(103,"shyam",79));
        map.put(4,new Student(104,"asif",82));
        map.put(5,new Student(105,"vishnu",74));
        map.put(6,new Student(106,"praveen",69));
        map.put(7,new Student(107,"mohan",90));
        transformUpper(map);
    }
}
