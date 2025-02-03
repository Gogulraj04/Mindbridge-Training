package Day5.AccessModifiers;

public class Person {
    public String name;
    protected int age;
    String address;
    private double salary;

    public Person(String name, int age, String address, double salary){
        this.name=name;
        this.age=age;
        this.address=address;
        this.salary=salary;
    }
    public void display(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Address :"+address);
        System.out.println("Salary :"+salary);
    }
}

