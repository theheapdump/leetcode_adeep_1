package easy.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RomanToIntTest {

  @Test
  public void testRomansToInteger() {
    assertEquals(1617, new RomanToInteger().romanToInt("MDCXVII"));
  }
}
