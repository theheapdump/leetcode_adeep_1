package easy.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class RomanToIntTest {

  @Test
  public void testRomansToInteger() {
    assertEquals(1617, new RomanToInteger().romanToInt("MDCXVII"));
  }
}
