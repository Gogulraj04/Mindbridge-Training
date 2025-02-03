package Day3;

class Shape {
    public int area(){
        System.out.print("The area of the shapes are based on the sizes : ");
        return 0;
    }
}
class Rectangle extends Shape{
    public int length;
    public int breadth;

    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int area(){
        return length*breadth;
    }
}
class Square extends Rectangle{
    public int side;

    public Square(int side){
        super(side,side);
    }
}
class formula{
    public static void main(String[] args){
        Shape sh=new Shape();
        System.out.println(sh.area());
        Square s1=new Square(3);
        System.out.println("The area of square is : "+s1.area());
        Rectangle r1=new Rectangle(3, 4);
        System.out.println("The area of rectangle is : "+r1.area());
    }
}
