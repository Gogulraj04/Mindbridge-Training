package Day5;
import Day5.Shapes.*;

public class Shapes_Main {
    public static void main(String[] args) {
        Circle c=new Circle();
        System.out.println("The area of the circle : "+c.area(5));
        Rectangle r=new Rectangle();
        System.out.println("The area of the rectangle : "+r.area(3,4));
    }
}
