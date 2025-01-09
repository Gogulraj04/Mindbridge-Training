package Day7.Reflection;

public class Person {
    private String name;
    private int age;
    Person(){

    }
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    private void displayDetails(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }

}
