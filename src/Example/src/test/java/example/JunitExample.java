package example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class JunitExample {

    Example example = new Example();

    @BeforeAll
    static void initAll() {
        System.out.println("before all");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("after all");
    }

    @BeforeEach
    void init() {
        System.out.println("before each");
    }

    @AfterEach
    void tearDown() {
        System.out.println("after each");
    }

    @Test
    public void testException() {
        assertThrows(RuntimeException.class, () -> example.methodThrowingException());
    }

    @Test
    public void testEqual() {
        assertEquals("value", example.value, "Example's value is not equal to 'value'");
    }

    @DisplayName("testing nothing")
    @Test
    public void testThatHasADisplayName() {
        assertTrue(true);
    }

    @Nested
    public class NestedTest {

        @Test
        public void testEqualNested() {
            assertEquals(1, 1);
        }

    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    public void testEqualParameterizedByValues(int input) {
        assertEquals(0, input * 0);
    }

    @ParameterizedTest
    @MethodSource("getValues")
    public void testEqualParameterizedByMethod(int input, String text) {
        assertEquals(0, input * 0, text);
    }

    private static Stream<Arguments> getValues() {
        return Stream.of(
                Arguments.of(2, "two"),
                Arguments.of(3, "tree"),
                Arguments.of(4, "four")
        );
    }
}
