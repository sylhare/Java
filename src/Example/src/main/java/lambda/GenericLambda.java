package lambda;

import java.util.Optional;

public class GenericLambda {

    public GenericSupplier<Boolean> supplier = () -> true;

    public <T> Optional<T> genericMethodWithOptional(GenericSupplier<Optional<T>> supplier) {
        return supplier.doStuff();
    }

    public <T> T genericMethod(GenericSupplier<T> supplier) {
        return supplier.doStuff();
    }

    public <T> String genericMethod(StringSupplier<T> supplier) {
        return  supplier.doStuff("var");
    }

    @FunctionalInterface
    public interface GenericSupplier<T> {
        T doStuff();
    }

    @FunctionalInterface
    public interface StringSupplier<T> {
        String doStuff(String variable);
    }
}
