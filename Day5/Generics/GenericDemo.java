package Day5.Generics;

class GenericDemo<K,V> {
    K Name;
    V Age;
    GenericDemo(){
        this.Name=null;
        this.Age=null;
    }
    GenericDemo(K name,V age){
        this.Name=name;
        this.Age=age;
    }
    public void setDetails(K name,V age){
        Name=name;
        Age=age;
    }

    public void display(){
        System.out.println("Name :"+Name);
        System.out.println("Age :"+Age);
    }
}
class Demo{
    public static void main(String[] args) {
        GenericDemo<String,Integer> obj1=new GenericDemo<>();
        GenericDemo<String,Integer> obj2=new GenericDemo<>("asif",21);
        obj1.setDetails("gogul",21);
        obj1.display();
        obj2.display();
    }
}
