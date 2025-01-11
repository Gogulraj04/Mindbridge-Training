package Day12;

import java.sql.*;

public class JDBC_Example {
    public static void main(String[] args) {
        try{
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost/Student","root","#Amaterasu@1224");
            Statement stm1=connection.createStatement();
//          Insert the value to the table
            String query="INSERT INTO Student_Details(id,name,age,mark) VALUES (101,\"gogul\",21,97)";
            int rs=stm1.executeUpdate(query);
            System.out.println("Affected rows : "+rs);

            query="INSERT INTO Student_Details(id,name,age,mark) VALUES (102,\"asif\",22,99)";
            rs=stm1.executeUpdate(query);
            System.out.println("Affected rows : "+rs);

            query="INSERT INTO Student_Details(id,name,age,mark) VALUES (103,\"shyam\",21,90)";
            rs=stm1.executeUpdate(query);
            System.out.println("Affected rows : "+rs);

//            display the student details
            ResultSet resultSet=stm1.executeQuery("SELECT * FROM Student_Details");
            while (resultSet.next()){
                System.out.println("Student ID : "+resultSet.getInt(1));
                System.out.println("Student Name : "+resultSet.getString(2));
                System.out.println("Student Age : "+resultSet.getInt(3));
                System.out.println("Student Mark : "+resultSet.getInt(4));
                System.out.println();
            }

            stm1.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
