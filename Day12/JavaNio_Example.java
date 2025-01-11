package Day12;

import java.nio.CharBuffer;
import java.nio.IntBuffer;

public class JavaNio_Example {
    public static void main(String[] args) {

//        IntBuffer
        IntBuffer ib=IntBuffer.allocate(9);//allocates the capacity to the buffer
        int number=9876543;

        System.out.println("Input : "+number);
        System.out.println("Capacity : "+ib.capacity());
        while(number!=0){
            int i=number%10;
            ib.put(i);
            number/=10;
        }
        int bufferpos=ib.position();
        System.out.println("Position after data written into buffer : "+bufferpos);

        ib.flip();//set to 0 to read
        bufferpos=ib.position();
        System.out.println("After flip : "+bufferpos);

        int bufferlimit=ib.limit();
        System.out.println("Distance of the data : "+bufferlimit);

        while(ib.hasRemaining()){
            System.out.println(ib.get());
        }
        System.out.println();
//        CharBuffer
        CharBuffer cb= CharBuffer.allocate(10);//allocates the capacity to the buffer
        String s="gogul";

        System.out.println("Input : "+s);
        System.out.println("Capacity : "+cb.capacity());
        for (int i = 0; i < s.length(); i++) {
            cb.put(s.charAt(i));
        }
        int bufferposChar=cb.position();
        System.out.println("Position after data written into buffer : "+bufferposChar);

        cb.flip();//set to 0 to read
        bufferposChar=cb.position();
        System.out.println("After flip : "+bufferposChar);

        int bufferlimitChar=cb.limit();
        System.out.println("Distance of the data : "+bufferlimitChar);

        while(cb.hasRemaining()){
            System.out.println(cb.get());
        }


    }
}
