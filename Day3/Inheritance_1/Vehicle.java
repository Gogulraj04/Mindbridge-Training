package Day3;

class Vehicle {
    public void start(){
        System.out.println("Vehicle runs smoothly..!");
    }
}
class Car extends Vehicle{
    public void start(){
        System.out.println("Car runs fastly...");
    }
    public static void main(String[] args){
        Car c1=new Car();
        c1.start();
    }
}
