public class LogicalandRelational_operator {
    public static void main(String[] args){
        int num1=10;
        int num2=51;
        int num3=25;
        if(num1>num2){
            System.out.println("Num 1 is greater");
        }else{
            System.out.println("Num 2 is greater");
        }
        if(num1>num2 && num1>num3){
            System.out.println("Num 1 is greater than other two.");
        } else if (num2>num1 && num2>num3) {
            System.out.println("Num 2 is greater than other two.");
        }else{
            System.out.println("Num 3 is greater than other two.");
        }
    }
}
