package Day6.LangObjects;

public class LangObject_Demo {
    String name;
    int num;

    LangObject_Demo(String name,int num){
        this.name=name;
        this.num=num;
    }

    public String toString() {
        return name+"_"+num*2;
    }

    public static void main(String[] args) {
        LangObject_Demo obj1=new LangObject_Demo("gogul",101);
        System.out.println(obj1.getClass()); //   class Day6.LangObject_Demo
        System.out.println(obj1.getClass().getName());//   Day6.LangObject_Demo
        System.out.println(obj1.toString());//here and below
        System.out.println(obj1);// both are same

    }
}
