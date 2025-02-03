package Day15;

import java.util.ArrayList;
import java.util.List;
class College{
    int id;
    String name;
    float gpa;

    public College(){

    }
    public College(int id,String name,float gpa){
        this.id=id;
        this.name=name;
        this.gpa=gpa;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
public class CalculateAverage {
    public static Float getAverageGpa(List<College> students){
        float[] avg = {0};
        students.forEach(College -> avg[0] += College.getGpa());
        return avg[0] /students.size();
    }
    public static void main(String[] args) {
        List<College> students=new ArrayList<>();
        students.add(new College(101,"gogul",7.7f));
        students.add(new College(102,"asif",8.5f));
        students.add(new College(103,"shyam",7.9f));
        students.add(new College(104,"praveen",8.3f));
        students.add(new College(105,"preethi",9.2f));
        students.add(new College(106,"vishnu",8.6f));
        students.add(new College(107,"pavi",7.2f));
        students.add(new College(108,"adams",8.0f));

        System.out.printf("Average : %.2f",getAverageGpa(students));

    }
}
