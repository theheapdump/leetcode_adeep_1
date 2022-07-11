package easy.others;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseBitsTest {

  @Test
  public void testReverseBits() {
    Assertions.assertEquals(1839673344, new ReverseBits().reverseBits(845238));
  }
}