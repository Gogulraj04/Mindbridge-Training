package Day2.OOPSBasics;

public class Calculator {
    public int add(int num1,int num2){
        return num1+num2;
    }
    public double add(double num1,double num2){
        return num1+num2;
    }
    public int add(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
}
class Add{
    public static void main(String[] args){
        Calculator c=new Calculator();
        System.out.println(c.add(4,6));
        System.out.println(c.add(900000001,100000020));
        System.out.println(c.add(new int[]{1,2,3,4,5}));
    }

}
