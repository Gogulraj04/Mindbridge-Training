package Day5.AutoboxingandVarargs;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Autoboxing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(sc.nextInt());
        }
        int sum=0;
        for(int i:list){
            sum+=i;
        }
        System.out.println(sum);
    }
}
