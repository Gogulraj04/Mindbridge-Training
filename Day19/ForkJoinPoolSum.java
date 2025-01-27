package Day19;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinPoolSum extends RecursiveTask<Long> {
    public final long THRESHOLD=100;
    long start;
    long end;

    public ForkJoinPoolSum(long start,long end){
        this.start=start;
        this.end=end;
    }


    @Override
    protected Long compute() {
        if(end - start <=THRESHOLD){
            long sum=0;
            for(long i=start;i<=end;i++){
                sum+=i;
            }
            return sum;
        }
        long mid = (end + start)/2;
        ForkJoinPoolSum left=new ForkJoinPoolSum(start,mid);
        left.fork();
        ForkJoinPoolSum right=new ForkJoinPoolSum(mid+1,end);

        right.fork();

        Long leftResult=left.join();
        Long rightResult=right.join();

        return leftResult+rightResult;
    }
}
class Main{
    public static void main(String[] args) {
        long start=1;
        long end=1000000;
        ForkJoinPool fork=new ForkJoinPool();
        ForkJoinPoolSum task=new ForkJoinPoolSum(start,end);
        System.out.println(fork.invoke(task));

    }
}
