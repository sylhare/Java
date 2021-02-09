package lambda;

import java.util.Arrays;
import java.util.Objects;

public class StreamExample {

  public static boolean isValid(String... values) {
    return values != null && Arrays.stream(values)
        .filter(Objects::nonNull)
        .filter(x -> !x.isEmpty())
        .filter(x -> !x.matches(".*[.\\s$]+.*")).count() == values.length;
  }
}
