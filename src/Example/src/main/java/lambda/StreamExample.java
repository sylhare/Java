package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {

    public static List<String> words = Arrays.asList("hello", "world");

    public static boolean isValid(String... values) {
        return values != null && Arrays.stream(values)
                .filter(Objects::nonNull)
                .filter(x -> !x.isEmpty())
                .filter(x -> !x.matches(".*[.\\s$]+.*")).count() == values.length;
    }

    public static boolean crossCheckList(List<String> values) {
        Predicate<String> wordCheck = valueWord -> words.stream().anyMatch(word -> word.equals(valueWord));
        return values.stream().filter(wordCheck).collect(Collectors.toList()).stream().findAny().isPresent();
    }
}
