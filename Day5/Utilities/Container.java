package Day5.Utilities;

public class Container <T>{
    T model;
    public Container(T model){
        this.model=model;
    }
    public T getValue(){
        return model;
    }
    public void setValue(T model){
        this.model=model;
    }
    public void displayModel(){
        System.out.println("Model : "+model);
    }


}

