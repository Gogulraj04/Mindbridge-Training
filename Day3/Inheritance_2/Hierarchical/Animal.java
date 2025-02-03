package Day3;

class Animal {
    public void sound(){
        System.out.println("The sound of animals");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("Cat meows");
    }
}
class Identify{
    public static void main(String[] args){
        Animal a=new Animal();
        a.sound();
        Animal c=new Cat();
        c.sound();
        Animal d=new Dog();
        d.sound();

    }
}
