package Day12;

import java.io.Serializable;

public class Product implements Serializable {
    String name;
    int price;
    boolean isAvailable;

    public Product(){

    }
    public Product(String name,int price){
        this.name=name;
        this.price=price;
        this.isAvailable=true;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
}