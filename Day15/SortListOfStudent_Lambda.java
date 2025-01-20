package Day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

class School{
    int id;
    String name;
    float gpa;

    public School(){

    }

    public School(int id,String name,float gpa){
        this.id=id;
        this.name=name;
        this.gpa=gpa;
    }

    public int getId(){
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

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return id+" ---> "+gpa;
    }
}
public class SortListOfStudent_Lambda {
    public static void sortByCgpa(List<School> students){
        Collections.sort(students,(student1,student2) -> Float.compare(student2.getGpa(),student1.getGpa()));
        System.out.println("After sorting");
        ListIterator iterator= students.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        List<School> students=new ArrayList<>();
        students.add(new School(101,"gogul",7.7f));
        students.add(new School(102,"asif",8.5f));
        students.add(new School(103,"shyam",7.9f));
        students.add(new School(104,"praveen",8.3f));
        students.add(new School(105,"preethi",9.2f));
        students.add(new School(106,"vishnu",8.6f));
        students.add(new School(107,"pavi",7.2f));
        students.add(new School(108,"adams",8.0f));

//      Before sorting
        System.out.println("Before sorting");
        ListIterator iterator= students.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
//        Method to sort by CGPA:
        sortByCgpa(students);

    }
}
