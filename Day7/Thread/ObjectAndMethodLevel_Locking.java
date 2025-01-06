package Day7.Thread;

class SharedPrinter{
    public static synchronized void printString(String s,int times){
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
    public static synchronized void countDown(int count){
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
    public void methodLocking(int val,String name){
        System.out.println("Hii : "+name);
        synchronized (this){
            for(int i=1;i<val;i++){
                System.out.println("Value of "+name+" is : "+i);
            }
        }
        System.out.println("------- Finish -----");
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
class MyThread5 implements Runnable{
    SharedPrinter obj;
    String name;
    int value;

    MyThread5(SharedPrinter onj,String name,int value){
        this.obj=onj;
        this.name=name;
        this.value=value;
    }
    public void run(){
        obj.methodLocking(value,name);
    }
}
public class ObjectAndMethodLevel_Locking {
    public static void main(String[] args) {
        SharedPrinter sp=new SharedPrinter();

        MyThread3 r1=new MyThread3(sp,"gogul",10);
        MyThread4 r2=new MyThread4(sp,10);
        MyThread5 r3=new MyThread5(sp,"vishnu",10);
        MyThread5 r4=new MyThread5(sp,"adams",10);

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        Thread t3=new Thread(r3);
        Thread t4=new Thread(r4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
