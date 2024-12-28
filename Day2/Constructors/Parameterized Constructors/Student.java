package Day2.Constructors;

class Student {
    String name;
    int age;
    Student(){
        this.name=null;
        this.age=0;
    }
    Student(String name1){
        this.name=name1;
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }
}
class UpdateSalary{
    public static void main(String[] args){
        Student s1=new Student();
        s1.display();
        Student s2=new Student("Gogul");
        s2.display();
        Student s3=new Student("asif",24);
        s3.display();
    }
}
