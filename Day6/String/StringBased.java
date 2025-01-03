package Day6;

import java.util.Scanner;

public class StringBased {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        StringBuilder s=new StringBuilder(input);
        System.out.println(s.reverse());

        String s1=sc.nextLine();
        String [] arr=s1.split(" ");
        int count=0;
        for(String i:arr){
            if(!i.isEmpty()){
                count++;
            }
        }
        System.out.println(count);

        String ans="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='a' || s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'){
                ans+="*";
            }else {
                ans+=s1.charAt(i);
            }
        }

        System.out.println(ans);
    }
}
