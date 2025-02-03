package Day17;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.function.Supplier;

public class CurrentDate_Supplier {
    public static void main(String[] args) {
        Supplier<LocalDateTime> supplier=() -> LocalDateTime.now();

        LocalDateTime DateAndTime=supplier.get();

        System.out.println("Current Date : "+DateAndTime.toLocalDate());
        System.out.println("Current Time : "+DateAndTime.toLocalTime());
    }
}
