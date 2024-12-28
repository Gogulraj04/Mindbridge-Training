package Day2.ThisKeywordandMethodOverloading;

class Area {
    public double area(double lenght,double width){
        return lenght*width;
    }
    public double area(int side){
        return side*side;
    }
    public double area(double radius){
        return 3.14*radius*radius;
    }
}
class Demo{
    public static void main(String[] args){
        Area obj1=new Area();
        System.out.println("Area of square :"+obj1.area(3));
        System.out.println("Area of circle :"+obj1.area(5.0));
        System.out.println("Area of rectangle :"+obj1.area(4,8));
    }
}
