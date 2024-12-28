package Day2.ThisKeywordandMethodOverloading;

import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id1,String name1,double salary1){
        this.id=id1;
        this.name=name1;
        this.salary=salary1;
    }
    public void setId(int id1){
        this.id=id1;
    }
    public void setName(String name1){
        this.name=name1;
    }
    public void setSalary(double salary1){
        this.salary=salary1;
    }
    public void display(){
        System.out.println("Employee id :"+id);
        System.out.println("Employee name :"+name);
        System.out.println("Employee salary :"+salary);
    }
}
class EmployeeDetails{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Employee e1=new Employee(101,"gogul",12000);
        int id=sc.nextInt();
        e1.setId(id);
        String s=sc.next();
        e1.setName(s);
        double salary=sc.nextDouble();
        e1.setSalary(salary);
        e1.display();
    }
}
