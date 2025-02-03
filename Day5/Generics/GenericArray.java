package Day5.Generics;
class Generic {
    public <T> void display(T[] arr){
        for(T i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
public class GenericArray {
    public static void main(String[] args) {
        Generic obj1=new Generic();

        String[] s={"gogul","Adams","Vishnu","Mukilan","Sharma"};
        Integer[] arr={1,2,3,4,5};
        Double[] arr1={20.4,34.98,56.87,234.9876};
        Byte[] arr2={0001,0101,0011,0010,0110};
        obj1.display(arr);
        obj1.display(arr1);
        obj1.display(arr2);

    }
}
