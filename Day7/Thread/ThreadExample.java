package Day7;
class MyThread1 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){

            }
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Square of "+i+" : "+(int)(Math.pow(i,2)));
            try{
                Thread.sleep(700);
            }catch (InterruptedException e){

            }
        }
    }
}
public class ThreadExample {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();

    }
}
