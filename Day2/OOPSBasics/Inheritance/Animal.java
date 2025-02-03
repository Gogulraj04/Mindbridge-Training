package Day2.OOPSBasics.Inheritance;

class Animal {
    public void speak(){
        System.out.println("Animal speaks");
    }
}
class Dog extends Animal{
    public void speak(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    public void speak(){
        System.out.println("Cat Meows");
    }
}
class Main{
    public static void main(String[] args){
        Animal obj1=new Dog();
        obj1.speak();

        Animal obj2=new Cat();
        obj2.speak();

    }
}