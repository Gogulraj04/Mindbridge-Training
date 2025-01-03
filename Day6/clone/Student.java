package Day6;

public class Student implements Cloneable{
    String name;
    Integer age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);

    }

    public static void main(String[] args) {
        try{
            Student s1=new Student("gogul",20);
            Student s2=(Student)s1.clone();
            System.out.println(s1.hashCode()+"======="+s2.hashCode());//object can be shallow cloning so the hashcode is diff.
            System.out.println(s1.name.hashCode()+"======="+s2.name.hashCode());
            System.out.println(s1.age.hashCode()+"======="+s2.age.hashCode());
            s1.display();
            s2.display();
        }catch (Exception _){

        }



    }

}

