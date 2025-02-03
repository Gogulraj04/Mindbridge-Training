package Day5;

import Day5.Utilities.Container;
import Day5.Utilities.Priority;


public class Utilities_Main {
    public static void main(String[] args) {
        Container<Integer> container=new Container<>(3412);
        container.displayModel();
        System.out.println("The model number is "+container.getValue());

        Container<String> container1=new Container<>("XL");
        container1.displayModel();
        System.out.println("The size of the container is "+container1.getValue());

        Priority p=Priority.MEDIUM;
        System.out.println(p+" "+p.displayPriority(p));

        Container<Priority> container2=new Container<>(Priority.LOW);
        container2.displayModel();
        container2.setValue(Priority.HIGH);
        System.out.println(container2.getValue());

        Priority p1=Priority.MEDIUM;
        Container<String> container3=new Container<>(p1.level);
        container3.displayModel();
        System.out.println(p1.level);
    }
}
