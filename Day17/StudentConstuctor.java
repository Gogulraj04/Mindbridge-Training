package Day17;

import java.util.function.Supplier;

@FunctionalInterface
interface StudentFactory{
    public StudentConstuctor create(String name, int marks);
}

public class StudentConstuctor {
    public String name;
    public int marks;
    public StudentConstuctor(){
        System.out.println("no args constructor");
    }
    public StudentConstuctor(String name,int marks){
        this.name=name;
        this.marks=marks;
        System.out.println("args constructor");
    }
    public String toString(){
        return name+" -> "+marks;
    }
    public static void main(String[] args) {
        StudentFactory studentFactory= StudentConstuctor::new;
        StudentConstuctor std1=studentFactory.create("gogul",89);
        Supplier<StudentConstuctor> supplier=StudentConstuctor::new;
        StudentConstuctor std2=supplier.get();
        System.out.println(std1);
        System.out.println(std2);
    }
}
