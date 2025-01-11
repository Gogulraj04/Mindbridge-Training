package Day12;

import java.io.*;


public class SerializableExample {
    public void doSerializable(){
        try{
            Product p=new Product();
            p.setName("pen");
            p.setPrice(25);
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Product.java"));
            oos.writeObject(p);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void doDeSerializable() {
        try{
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Product.java"));
            Product p=(Product) ois.readObject();
            System.out.println(p.getName());
            System.out.println(p.getPrice());
            ois.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        SerializableExample p=new SerializableExample();
        p.doSerializable();
        p.doDeSerializable();
    }
}
