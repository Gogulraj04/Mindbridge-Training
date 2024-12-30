package Day3;

abstract class Appliance {
    abstract boolean turnOn();
    public boolean turnOff(){
        return false;
    }
}
class Fan extends Appliance{
    public boolean turnOn(){
        return true;
    }
}
class Operate{
    public static void main(String[] args){
        Fan f=new Fan();
        System.out.println(f.turnOn());
        System.out.println(f.turnOff());

    }

}
