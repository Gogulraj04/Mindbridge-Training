package Day11;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void validate(ArrayList<String> arr){
        String pattern="^[a-zA-Z0-9][a-zA-Z0-9._-]*@[a-zA-Z0-9.-]+\\.(com|org|net)$";
        Pattern p=Pattern.compile(pattern);
        for(String i:arr){
            Matcher match= p.matcher(i);
            System.out.println(arr.indexOf(i)+" : "+match.matches());
        }


    }
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("user@example.com");
        arr.add("user.name@domain.org");
        arr.add("invalid-email@domain");
        arr.add("user@domain_net");
        arr.add("@missinguser.com");


        validate(arr);
    }
}
