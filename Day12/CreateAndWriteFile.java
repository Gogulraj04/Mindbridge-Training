package Day12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CreateAndWriteFile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Write file
        try{
            String content=sc.nextLine();
            BufferedWriter bw =new BufferedWriter(new FileWriter("name.txt"));
            bw.write(content);
            bw.close();
        }catch (Exception e){
            System.out.println("Error while writing the file");
            e.printStackTrace();
        }

        //Read file
        try {
            BufferedReader br=new BufferedReader(new FileReader("name.txt"));
            StringBuilder sb=new StringBuilder();
            String s;
            while ((s=br.readLine())!=null){
                sb.append(s);
            }
            br.close();
            System.out.println(sb);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
