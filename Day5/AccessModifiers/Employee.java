package Day5.AccessModifiers;

public class Employee extends Person{
        public Employee(String name,int age,String address,double salary){
            super(name,age,address,salary);

        }
        public void displayEmployee(){
            System.out.println("Name :"+name);
            System.out.println("Age :"+age); // it is default
            System.out.println("Address :"+address);// it is access here because it is it's sub-class
//            System.out.println("Salary :"+salary); Can't access because it is private.
        }
}
