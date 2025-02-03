package Day3;
interface Printer{
    public void print();
}
interface Scanner{
    public void scan();
}
public class AllInOne implements Printer,Scanner{
    public void print() {
        System.out.println("Printer prints successfully");
    }
    public void scan(){
        System.out.println("Scanner scans successfully");
    }
    public static  void main(String[] args){
        AllInOne a1=new AllInOne();
        a1.print();
        a1.scan();
    }

}
