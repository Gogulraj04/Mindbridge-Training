package Day17;

import java.util.Optional;
import java.util.Scanner;

public class HandlingNull_Optional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=null;
        Optional<String> optionalS=Optional.ofNullable(str);
        System.out.println(optionalS.isPresent());
        if(optionalS.isPresent()){
            str=str.toUpperCase();
        }else {
            str=optionalS.orElse("Empty String");
        }
        System.out.println(str);
    }
}
