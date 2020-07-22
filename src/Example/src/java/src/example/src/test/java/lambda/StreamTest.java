package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/

public class StreamTest {

  public static void main(String[] args) {
    String string = "abc-de3-2fg";

    String s1 = string.chars().filter(Character::isLetter)
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
    System.out.println(s1);

    String s2 = string.chars().map(x -> "*".codePointAt(0)).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
    System.out.println(s2);

    List<String> number = Arrays.asList("1", "2", "3");
    List<String> numberStreamed = number.stream().map(s -> "number " + s).collect(Collectors.toList());
    System.out.println(numberStreamed);
    number.stream().map(n -> "number" + n).forEach(System.out::println);

    List<Integer> realNumber = Arrays.asList(1, 2, 3);
    List<String> realNumberStreamed = realNumber.stream().map(String::valueOf).collect(Collectors.toList());
    System.out.println(realNumberStreamed);

    List<String> myList =
        Arrays.asList("a1", "a2", "b1", "c2", "c1");

    myList
        .stream()
        .filter(s -> s.startsWith("c"))
        .map(String::toUpperCase)
        .sorted()
        .forEach(System.out::println);

  }

}
