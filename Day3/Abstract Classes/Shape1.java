package Day3;

abstract class Shape1 {
    abstract double calculateArea();
}
class Circle1 extends Shape1{
   int side;
   Circle1(int side){
       this.side=side;
   }
    double calculateArea(){
        return 3.14*side*side;
    }

}
class Rectangle1 extends Shape1{
    int length;
    int breadth;
    Rectangle1(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    double calculateArea(){
        return 0.5*length*breadth;
    }
}
class Implement{
    public static void main(String[] args){
        Circle1 c=new Circle1(3);
        System.out.println(c.calculateArea());
        Rectangle1 r=new Rectangle1(3,4);
        System.out.println(r.calculateArea());
    }
}

