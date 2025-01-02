package Day5.Default;

import Day5.AccessModifiers.*;
public class TestAccess {
    public static void main(String[] args) {
        Person p=new Person("gogul",21,"123 xyz street",25000);
        System.out.println("Name :"+p.name);//in the testaccess class name can onlu be accessible.
//        System.out.println("Age :"+p.age);
//        System.out.println("Address :"+p.address);
//            System.out.println("Salary :"+p.salary); Can't access because it is private.
        p.display();
        Employee e=new Employee("shan",20,"321 abc street",35000);
        e.displayEmployee();

    }

}
