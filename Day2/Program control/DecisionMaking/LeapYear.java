package Day2.DecisionMaking;

public class LeapYear {
    static void check(int n) {
        boolean isLeapYear=false;
        if(n%4==0) {
            if(n%100 !=0 || n%400==0) {
                isLeapYear=true;
            }
        }else {
            isLeapYear= false;
        }
        if(!isLeapYear) {
            System.out.print(n+" is not leapyear");
        }
        else {
            System.out.print(n+" is leapyear");

        }
    }
    public static void main(String[] args) {
        check(2005);

    }
}
