package example;

public class Example {

    String value = "value";

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public void methodThrowingException() {
        throw new RuntimeException("expected");
    }

}
