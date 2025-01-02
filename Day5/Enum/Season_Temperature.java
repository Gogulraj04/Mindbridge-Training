package Day5.Enum;
enum Season{
    WINTER ("10-25 degree Celcius"),
    SPRING ("25-32 degree Celcius"),
    SUMMER ("32-40 degree Celcius"),
    FALL ("25-34 degree Celcius");

    final String temperature;
    Season(String s){
        this.temperature=s;
    }
    public String getAverageTemperature(Season s){
        return s.temperature;
    }
}
public class Season_Temperature {
    public static void main(String[] args) {
        Season s=Season.WINTER;
//        System.out.println(s.getAverageTemperature(s));
//        System.out.println(s.temperature);
        for(Season i:Season.values()){
            System.out.println(i+" "+i.temperature);
        }
    }
}
