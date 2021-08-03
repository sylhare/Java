package lambda;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GenericLambdaTest {

    private final GenericLambda genericLambda = new GenericLambda();

    @Test
    public void genericLambdaSupplier() {
        assertTrue(genericLambda.supplier.doStuff());
    }

    @Test
    public void genericLambdaMethod() {
        assertTrue(genericLambda.genericMethod(() -> true));
        assertTrue(genericLambda.genericMethod(genericLambda.supplier));
    }

    @Test
    public void genericLambdaMethodOptional() {
        GenericLambda.GenericSupplier<Optional<String>> supplier = () -> Optional.of("Hello");
        Assertions.assertEquals("Hello", genericLambda.genericMethodWithOptional(supplier).orElse("fail"));
        Assertions.assertEquals("Hello", genericLambda.genericMethod(supplier).orElse("fail"));
    }
}
