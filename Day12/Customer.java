package Day12;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Customer implements Externalizable {
    String name;
    transient int age;

    public Customer(){

    }
    public Customer(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Write");
        out.write((int) age);
    }

    public void readExternal(ObjectInput in) throws IOException {
        System.out.println("Read");
        age=in.read();
    }
}
