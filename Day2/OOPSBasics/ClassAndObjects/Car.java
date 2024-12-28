package Day2.OOPSBasics;

//Create a class Car with attributes like brand, model, and price.
// Write methods to display details of a car and calculate the discounted price.

import java.util.Scanner;

class Car {
    String brand;
    String model;
    double price;

    Car(String brand1,String model1,double price1){
        this.brand=brand1;
        this.model=model1;
        this.price=price1;
    }

    public void display(){
        System.out.println("Car brand : "+brand);
        System.out.println("Car model : "+model);
        System.out.println("Car price : "+price);
    }
    public double dicountDetails(double discount){
        if(discount<0 || discount>100){
            System.out.println("Invalid discount percentage..!");
            return price;
        }
        return price-(price*discount)/100;
    }
}
class Entry{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String brand=sc.next();
        String model=sc.next();
        double price=sc.nextDouble();

        Car c1=new Car(brand,model,price);
        c1.display();
        System.out.println("Enter discount details :");
        double discount=sc.nextDouble();
        System.out.println("After "+discount+"% of Discount the price will be : "+c1.dicountDetails(discount));
    }
}