package Day20;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class Event {
    private String name;
    private LocalDateTime dateTime;
    private int duration;

    public Event(){

    }
    public Event(String name,LocalDateTime dateTime,int duration){
        this.name=name;
        this.dateTime=dateTime;
        this.duration=duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Date/Month/Year -> Time : "+dateTime.getDayOfYear()+"/"+dateTime.getMonthValue()+"/"+dateTime.getYear()+" -> "+dateTime.getHour()+":"+dateTime.getMinute());
        if(duration>1){
            System.out.println("Duration : "+duration+" hours");
        }else {
            System.out.println("Duration : "+duration+" hour");
        }

    }

    public static void main(String[] args) {
        System.out.println("---------- The input format -------- ");
        System.out.println("1. Event Name");
        System.out.println("2. Date & Time ->(YEAR,MONTH,DATE,HOUR,MINUTES)");
        System.out.println("3. Duration");
        List<Event> events=List.of(new Event("Meeting",LocalDateTime.of(2025,01,4,10,30),1),
                new Event("Workshop",LocalDateTime.of(2025,01,24,4,10),3),
                new Event("Function",LocalDateTime.of(2025,01,24,14,0),2),
                new Event("Conference",LocalDateTime.of(2025,01,30,3,45),1));

        System.out.println("------------- Display all Events -------------");
        events.forEach(Event::display);

        LocalDate specificDate= LocalDate.of(2025,01,24);
        List<Event> specificDateEvents=events.stream().filter((date) ->date.getDateTime().toLocalDate().equals(specificDate))
                .collect(Collectors.toList());

        System.out.println("-----------------------");
        System.out.println("Events on : "+specificDate);
        specificDateEvents.forEach((event -> System.out.println(event.getName())));

        System.out.println("--------------------------");
        for (int i = 0; i < events.size()-1; i++) {
            Event evnt1= events.get(i);
            Event evnt2=events.get(i+1);
            Duration between=Duration.between(evnt1.getDateTime(),evnt2.getDateTime());
            long totalMinutes=between.toMinutes();
            long hour=between.toHours()%60;
            long min=between.toMinutes()%60;
            System.out.print("Time difference b/w "+evnt1.getName()+" and "+evnt2.getName()+" : ");
            System.out.printf("Total Minutes :%d, Days :%d, Hours:%d, Minutes:%d \n",totalMinutes,between.toDays(),hour,min);
        }
    }

}
