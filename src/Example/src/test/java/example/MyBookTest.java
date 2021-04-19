package example;


import org.junit.jupiter.api.Test;


public class MyBookTest {

    @Test
    public void testDisplay() {
        MyBook bookie = new MyBook("title", "auther", 1);
        bookie.display();
    }

}
