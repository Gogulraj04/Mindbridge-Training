package Day7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.SQLOutput;

public class ReflectionExample {
    public static void main(String[] args) {
        try{
            Class c1=Class.forName("Day7.Person");
            //Methods
            Method method[]=c1.getDeclaredMethods();
            for (int i=0;i< method.length;i++){
                System.out.println(method[i].getName()+" ---- "+method[i].getReturnType().getName());
            }
            //Feilds
            Field field[]=c1.getDeclaredFields();
            for (int i = 0; i < field.length; i++) {
                System.out.println(field[i].getName()+" ---- "+field[i].getType().getName());
            }
            //Constructors
            Constructor constructor[]=c1.getDeclaredConstructors();
            for(int i=0;i< constructor.length;i++){
                System.out.println(constructor[i]);
            }

            Person p=(Person)constructor[1].newInstance("gogul",21);
            System.out.println(p);

//            p.displayDetails(); cant accessible because it is private.
            for(int i=0;i< method.length;i++){
                if(method[i].getName().indexOf("displayDetails")!=-1){
                    method[i].setAccessible(true);
                    method[i].invoke(p);
                }
            }
            Method method1=p.getClass().getMethod("setName", String.class);
            method1.invoke(p,"gogul");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
