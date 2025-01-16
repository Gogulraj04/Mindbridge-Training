package Day13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    public void OddLength() {
        assertTrue(Palindrome.isPalindrome("madam"));
        assertTrue(Palindrome.isPalindrome("malayalam"));
        assertTrue(Palindrome.isPalindrome("Madam"));
    }

    @Test
    public void EvenLength() {
        assertTrue(Palindrome.isPalindrome("abba"));
        assertTrue(Palindrome.isPalindrome("oddo"));
    }

    @Test
    public void NonPalindrome() {
        assertFalse(Palindrome.isPalindrome("gogul"));
    }

    @Test
    public void isPalinNumber(){
        assertEquals(true,Palindrome.isPalindrome(121));
        assertEquals(false,Palindrome.isPalindrome(123));
        assertEquals(true,Palindrome.isPalindrome(101));
        assertEquals(false,Palindrome.isPalindrome(321));
    }

    @Test
    public void EmptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    public void SingleCharacter() {
        assertTrue(Palindrome.isPalindrome("a"));
        assertTrue(Palindrome.isPalindrome("b"));
        assertTrue(Palindrome.isPalindrome("c"));
        assertTrue(Palindrome.isPalindrome("d"));
        assertTrue(Palindrome.isPalindrome("e"));
        assertTrue(Palindrome.isPalindrome("f"));
        assertTrue(Palindrome.isPalindrome("z"));
    }

    @Test
    public void SpecialCharacter(){
        assertFalse(Palindrome.isPalindrome("g@gul"));
        assertFalse(Palindrome.isPalindrome("g@gul!"));
        assertFalse(Palindrome.isPalindrome("!g@gul$"));
        assertTrue(Palindrome.isPalindrome("a@@a"));
        assertTrue(Palindrome.isPalindrome("b@@b"));
    }

    @Test
    public void testNullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Palindrome.isPalindrome(null);
        });
        assertEquals("String can't be null", exception.getMessage());
    }

}