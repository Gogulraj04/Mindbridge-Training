package Day3;

interface Vehicle1{
    public void start();
}
interface FourWheeler extends Vehicle1{
    public void start();
    public void fuel();
}
interface TwoWheeler extends Vehicle1{
    public void start();
    public void fuel();
}

class Car1 implements FourWheeler{
    public void start() {
        System.out.println("Casr start's by push button");
    }
    public void fuel(){
        System.out.println("Car run's on Diesel (or) petrol");
    }
}

class Bike implements TwoWheeler{
    public void start() {
        System.out.println("Bike start's by self start");
    }

    public void fuel() {
        System.out.println("Bike run's on petrol only");
    }
}

class Move{
    public static void main(String[] args){
        Bike b=new Bike();
        b.start();
        b.fuel();

        Car1 c=new Car1();
        c.start();
        c.fuel();

    }
}