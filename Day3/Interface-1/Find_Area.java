package Day3;
interface Constants{
    static double PI=3.14;
}
class Circle implements Constants{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    public double areaOfCircle(){
        return PI*radius*radius;
    }
}
public class Find_Area {
    public static void main(String[] args){
        Circle c=new Circle(4);
        System.out.println(c.areaOfCircle());
    }
}
