package lambda;

import java.util.function.Function;

public class UseLambda {
    public static String add(String string, MyLambda myLambda) {
        return myLambda.method(string);
    }

    public static String add(String string, Function<String, String> fn) {
        return fn.apply(string);
    }

    public static Foo execute(String string, Bar bar) {
        return bar.method(string);
    }
}
