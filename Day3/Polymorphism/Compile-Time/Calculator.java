package Day3;

public class Calculator {
    public int add(int num1, int num2){
        return num1+num2;
    }
    public double add(double num1, double num2){
        return num1+num2;
    }
    public int add(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public static void main(String[] args){
        Calculator c=new Calculator();
        System.out.println(c.add(5,5));
        System.out.println(c.add(5.0,6.0));
        System.out.println(c.add(8,2,5));
    }
}
