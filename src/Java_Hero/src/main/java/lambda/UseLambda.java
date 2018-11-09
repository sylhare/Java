package lambda;

import java.util.function.Function;

public class UseLambda {
  public static String add(String string, Foo foo) {
    return foo.method(string);
  }

  public static String add(String string, Function<String, String> fn) {
    return fn.apply(string);
  }

  public static Stuff execute(String string, Bar bar) {
    return bar.method(string);
  }
}
