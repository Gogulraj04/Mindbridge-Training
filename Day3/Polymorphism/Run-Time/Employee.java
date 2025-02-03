package Day3.Polymorphism;

class Employee {
    public void calculateSalary(){
        System.out.println("The salary is based on the role");
    }
}
class Manager extends Employee{
    public void calculateSalary(){
        System.out.println("The salary of manager is 100000");
    }
}
class Developer extends Employee{
    public void calculateSalary(){
        System.out.println("The salary of developer is 80000");
    }
}
class Company{
    public static void main(String[] args){
        Employee e1=new Manager();
        Employee e2=new Developer();
        e1.calculateSalary();
        e2.calculateSalary();
    }
}