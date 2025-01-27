package Day19;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class MyCallable implements Callable<Long> {
    public long val;
    public MyCallable(long val){
        this.val=val;
    }
    public Long call(){

        long fact=1;
        for(long i=1;i<=val;i++){
            fact*=i;
        }
        return fact;
    }
}
public class FactorialTask {
    private static final int THREADS=10;
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(THREADS);
        List<Future<Long>> list=new ArrayList<>();
        for(int i=1;i<=20;i++){
            Callable<Long> worker=new MyCallable(i);
            Future<Long> submit=executor.submit(worker);
            list.add(submit);
        }
        System.out.println(list.size());

        executor.shutdown();
        while (!executor.isTerminated()){
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for(Future<Long> i:list){
            try{
                System.out.println(i.get());
            } catch (InterruptedException |ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
