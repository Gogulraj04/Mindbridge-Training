package Day11;

import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

class MyThread extends Thread{
    public Online_Voting_System obj;
    public String candidate;
    public MyThread(Online_Voting_System obj,String candidate){
        this.obj=obj;
        this.candidate=candidate;
    }
    public void run(){
        obj.vote(candidate);
        System.out.println(Thread.currentThread().getName()+" You voted for the candidate : "+candidate);
    }
}
public class Online_Voting_System {
    public static ConcurrentMap<String, Integer> votes = new ConcurrentHashMap<>();

    public static synchronized void vote(String candidate){
        if(votes.putIfAbsent(candidate,1)!=null){
            votes.replace(candidate,votes.get(candidate)+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] candidates={"adams","gogul","vishnu","pavi"};
        System.out.println("----- Election Voting -----");

        Online_Voting_System obj=new Online_Voting_System();

        MyThread t1=new MyThread(obj,"gogul");
        MyThread t2=new MyThread(obj,"pavi");
        MyThread t3=new MyThread(obj,"adams");
        MyThread t8=new MyThread(obj,"adams");
        MyThread t4=new MyThread(obj,"gogul");
        MyThread t5=new MyThread(obj,"gogul");
        MyThread t6=new MyThread(obj,"vishnu");
        MyThread t7=new MyThread(obj,"vishnu");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
            t8.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(Map.Entry<String,Integer> i:votes.entrySet()){
            System.out.println(i.getKey() + ": " + i.getValue());
        }


    }
}
