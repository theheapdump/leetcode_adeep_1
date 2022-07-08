package easy.others;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ReverseBitsTest {

  @Test
  public void testReverseBits() {
    Assertions.assertEquals(1839673344, new ReverseBits().reverseBits(845238));
  }
}