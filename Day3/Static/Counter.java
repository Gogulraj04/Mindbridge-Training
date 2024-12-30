package Day3;

class Counter {
    static int count;

    static {
//        count=0;
        System.out.println("The initialization of static variable count is : "+count);
    }
    public Counter(){
        count++;
        System.out.println("count : "+count);

    }
    static void display(){
        System.out.println("The final value of count is : "+count);
    }
    public static void main(String[] args){
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
        display();

    }
}
