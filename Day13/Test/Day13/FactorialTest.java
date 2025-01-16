package Day13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    public void check(){
        assertEquals(120,Factorial.fact(5));
    }

    @Test
    public void negCheck(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Factorial.fact(-1);
        });
        assertEquals("negative numbers", exception.getMessage());
    }

}