package Day11;
class Box<T> {
    T items;

    public void setItems(T items){
        this.items=items;
    }
    public T getItems(){
        return this.items;
    }
    public void printItems(){
        System.out.println(items);
    }
    public boolean isTypeOf(Class<?> type){
        if(items!=null && type.isInstance(items)){
            return true;
        }else{
            return false;
        }
    }
}
public class GenericsExample {
    public static void main(String[] args) {
        Box<String> b1=new Box<>();
        b1.setItems("pencil");
        b1.getItems();
        b1.printItems();
        System.out.println(b1.isTypeOf(String.class));
        System.out.println(b1.isTypeOf(Integer.class));

        System.out.println();

        Box<Integer> b2=new Box<>();
        b2.setItems(28);
        b2.getItems();
        b2.printItems();
        System.out.println(b2.isTypeOf(String.class));
        System.out.println(b2.isTypeOf(Integer.class));

        System.out.println();

        Box<Double> b3=new Box<>();
        b3.setItems(5432.6543);
        b3.getItems();
        b3.printItems();
        System.out.println(b3.isTypeOf(String.class));
        System.out.println(b3.isTypeOf(Float.class));
        System.out.println(b3.isTypeOf(Double.class));
    }
}
