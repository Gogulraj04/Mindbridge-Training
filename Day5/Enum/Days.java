package Day5.Enum;

public class Days {
    enum days{
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday
    }
    public static void print(days daysa){
        switch (daysa){
            case Saturday:
            case Sunday:
                System.out.println("It is Weekend");
                break;

            default:
                System.out.println("It is Weekdays");
        }
    }
    public static void main(String[] args) {
        Days d=new Days();
        d.print(days.Monday);
        print(days.Tuesday);
        print(days.Wednesday);
        print(days.Thursday);
        print(days.Friday);
        print(days.Saturday);
        print(days.Sunday);
    }
}
