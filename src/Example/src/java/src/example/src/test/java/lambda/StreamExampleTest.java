package lambda;

import org.junit.Test;

import static lambda.StreamExample.isValid;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StreamExampleTest {


  @Test
  public void isItValid() {
    assertFalse(isValid("test", "fault$ty"));
    assertFalse(isValid("test", null));
    assertFalse(isValid(null, "test"));
    assertFalse(isValid("$wdcaw7"));
    assertTrue(isValid("test"));
    assertTrue(isValid("test", "test2"));
    assertFalse(isValid(null));
  }


}
