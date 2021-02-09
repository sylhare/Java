package example;

import junit.framework.TestCase;
import org.junit.Test;

public class MyBookTest extends TestCase {

  @Test
  public void testDisplay() {
    MyBook bookie = new MyBook("title", "auther", 1);
    bookie.display();
  }

}