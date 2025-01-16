package Day13;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReverseTest {
    @Test
    public void isEmptyString() {
        assertEquals("",StringReverse.reverse(""));
    }

    @Test
    public void normalString(){
        assertEquals("lugog",StringReverse.reverse("gogul"));
        assertEquals("lugoG",StringReverse.reverse("Gogul"));
    }

    @Test
    public void SingleCharacter(){
        assertEquals("g",StringReverse.reverse("g"));
    }

    @Test
    public void SpecialCharacter(){
        assertEquals("lug@g",StringReverse.reverse("g@gul"));
        assertEquals("!lug@g",StringReverse.reverse("g@gul!"));
        assertEquals("$lug@g!",StringReverse.reverse("!g@gul$"));
    }

    @Test
    public void NullCheck() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            StringReverse.reverse(null);
        });
        assertEquals("String can't be null", exception.getMessage());
    }
}