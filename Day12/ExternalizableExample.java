package Day12;

import java.io.*;

public class ExternalizableExample {
    public void doExternalizable(){
        try{
            Customer c=new Customer();
            c.setName("gogul");
            c.setAge(22);
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Customer.java"));
            oos.writeObject(c);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void doDeExternalizable() {
        try{
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Customer.java"));
            Customer c=(Customer) ois.readObject();
            System.out.println(c.getName());
            System.out.println(c.getAge());
            ois.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        ExternalizableExample p=new ExternalizableExample();
        p.doExternalizable();
        p.doDeExternalizable();
    }
}
