package easy.others;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOf1BitsTest {

  @Test
  public void testNumberOfBits() {
    Assertions.assertEquals(3, new NumberOf1Bits().hammingWeight(11));
  }
}
