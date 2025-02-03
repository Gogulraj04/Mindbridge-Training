import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread0 implements Runnable{
    private CountDownLatch cd;
    MyThread0(CountDownLatch cd){
        this.cd=cd;
    }
    public void run(){
        int count=0;
        for(int i=0;i<10;i++){
            count++;
            System.out.println("hii");
            try{
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
        }
        System.out.println(count);
        cd.countDown();

    }
}
public class ExecutorDemo {
    public static void main(String[] args) {
        CountDownLatch cd=new CountDownLatch(3);
        ExecutorService exe=Executors.newFixedThreadPool(2);
        for(int i=0;i<4;i++) {
            exe.submit(new MyThread0(cd));
        }
        exe.shutdown();
        try{
            cd.await();
        } catch (InterruptedException e) {

        }

    }
}
