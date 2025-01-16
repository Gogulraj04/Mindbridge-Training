package Day13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {
    @Test
    public void check(){
        assertEquals(true,PrimeNumber.isPrime(3));
        assertEquals(true,PrimeNumber.isPrime(5));
        assertEquals(true,PrimeNumber.isPrime(7));
        assertEquals(true,PrimeNumber.isPrime(11));
        assertEquals(true,PrimeNumber.isPrime(13));
        assertEquals(true,PrimeNumber.isPrime(17));
        assertEquals(true,PrimeNumber.isPrime(2));
        assertEquals(true,PrimeNumber.isPrime(1000003));

        assertEquals(false,PrimeNumber.isPrime(0));
        assertEquals(false,PrimeNumber.isPrime(18));
        assertEquals(false,PrimeNumber.isPrime(4));
        assertEquals(false,PrimeNumber.isPrime(28));
        assertEquals(false,PrimeNumber.isPrime(6));
        assertEquals(false,PrimeNumber.isPrime(88));
        assertEquals(false,PrimeNumber.isPrime(1));
        assertEquals(false,PrimeNumber.isPrime(-1));
    }

}