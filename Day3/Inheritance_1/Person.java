package Day3.Inheritance_1;


class Person {
    public String name;
    public int age;

}
class Student extends Person{
    int rollNumber;
    int marks;

    public Student(int rollNumber,int marks,String name,int age){
        this.rollNumber=rollNumber;
        this.marks=marks;
        this.name=name;
        this.age=age;
    }

    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Roll Number : "+rollNumber);
        System.out.println("Marks"+marks);
    }
    public static void main(String[] args){
        Student std1=new Student(101,75,"gogul",20);
        Student std2=new Student(102,79,"Asif",21);
        std1.display();
        std2.display();


    }
}