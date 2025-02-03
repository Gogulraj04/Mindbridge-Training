package Day6.String;

import java.util.Scanner;

public class StringExample2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        if(s1.compareTo(s2)<0){
            System.out.println("first string lexicographically smaller than second string");
        } else if (s1.compareTo(s2)>0) {
            System.out.println("first string lexicographically greater than second string");
        }else{
            System.out.println("two strings lexicographically equal");
        }

        if(s1.equals(s2)){
            System.out.println("Strings are exactly same {Case sensitive}");
        }else{
            System.out.println("Strings are not exactly same {Case sensitive}");
        }

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("two strings equal {case-insensitive}");
        } else {
            System.out.println("two strings not equal {case-insensitive}");
        }

        if(s1==s2){
            System.out.println("Both string reference are same");
        }else{
            System.out.println("Both string reference are not same");
        }


        System.out.println(s1.concat(s2));
        System.out.println(s1+s2);



    }
}
