package Day5.StaticImport;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Hypotenuse {
    static double find(double side1,int side2){
        return sqrt(pow(side1,2)+pow(side2,2));
    }
    public static void main(String[] args) {
        System.out.printf("%.2f",find(6,9));
    }
}
