package lambda;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class StreamExampleTest {

    @Test
    public void isValidTest() {
        assertTrue(StreamExample.isValid("allo", "it", "is", "me"));
    }

    @Test
    public void isNotValidTest() {
        assertFalse(StreamExample.isValid("allo", "it", "is", null));
        assertFalse(StreamExample.isValid("allo", "it", "is", ""));
        assertFalse(StreamExample.isValid("allo", "it", "is", "[.hello]"));
    }

}
