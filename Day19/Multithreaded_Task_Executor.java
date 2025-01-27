package Day19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable implements Runnable{
    private int taskNum;
    public MyRunnable(int taskNum){
        this.taskNum=taskNum;
    }
    public void run(){
        System.out.println("Task run by : "+Thread.currentThread().getName());

        for(int i=1;i<=10;i++){
            System.out.println("TaskID : "+taskNum+"  "+"Task path : "+i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("task completed by : "+Thread.currentThread().getName());

    }
}
public class Multithreaded_Task_Executor {
    public static void main(String[] args) {
        ExecutorService excutor= Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 10; i++) {
            Runnable run=new MyRunnable(i);
            excutor.submit(run);
        }
        excutor.shutdown();
    }
}
