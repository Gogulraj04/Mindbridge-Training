package Day16;

public class Student{
    String name;
    int grade;
    public Student(){

    }
    public Student(String name,int grade){
        this.name=name;
        this.grade=grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString(){
        return name+" : "+grade;
    }

}
