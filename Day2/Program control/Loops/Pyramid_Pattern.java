package Day2.Loops;

public class Pyramid_Pattern {
    static void pyramid(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=0;j<n-i;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pyramid(5);

    }
}
