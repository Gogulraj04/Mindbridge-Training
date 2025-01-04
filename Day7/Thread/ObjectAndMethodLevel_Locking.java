package Day7;

class SharedPrinter{
    public synchronized void printString(String s,int times){
        System.out.println("Start printing");
        for(int i=0;i<times;i++){
            System.out.println("Printing message : "+s);
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {

            }
        }
        System.out.println("Printing done..!");
    }
    public synchronized void countDown(int count){
        System.out.println("Countdown starts..!");
        for(int i=count;i>0;i--){
            System.out.println(i);
            try{
                Thread.sleep(400);
            }catch (InterruptedException e){

            }
        }
        System.out.println("Count Down..!");
    }
}
class MyThread3 implements Runnable{
    SharedPrinter obj;
    String s;
    int times;
    MyThread3(SharedPrinter obj,String s,int times) {
        this.obj = obj;
        this.s = s;
        this.times = times;
    }
    public void run(){
        obj.printString(s,times);
    }
}
class MyThread4 implements Runnable{
    SharedPrinter obj;
    int count;
    MyThread4(SharedPrinter obj,int count){
        this.obj=obj;
        this.count=count;
    }
    public void run(){
        obj.countDown(count);
    }
}
public class ObjectAndMethodLevel_Locking {
    public static void main(String[] args) {
        SharedPrinter sp=new SharedPrinter();

        MyThread3 r1=new MyThread3(sp,"gogul",10);
        MyThread4 r2=new MyThread4(sp,10);

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);

        t1.start();
        t2.start();
    }
}
