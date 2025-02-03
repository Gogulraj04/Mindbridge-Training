package Day3;

interface Animal1{
    public void eat();
    public void sleep();

}
class Dog1 implements Animal1 {
    public void eat(){
        System.out.println("Dog eats pedigree");
    }
    public void sleep(){
        System.out.println("Dogs sleeps at night");
    }
}
class Cat1 implements Animal1 {
    public void eat(){
        System.out.println("Cats eats at fish");
    }
    public void sleep(){
        System.out.println("Cats sleeps at day");
    }
}
public class Animals_Routine{
    public static void main(String[] args){
        Dog1 d=new Dog1();
        d.eat();
        d.sleep();

        Cat1 c=new Cat1();
        c.eat();
        c.sleep();
    }

}