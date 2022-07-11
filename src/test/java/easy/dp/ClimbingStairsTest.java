package easy.dp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import easy.math.RomanToInteger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

public class ClimbingStairsTest {

  @Test
  public void testClimbStairs() {
    assertEquals(987, new ClimbingStairs().climbStairs(15));
  }
}


