package easy.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

public class TwoSumProblemTest {

  @Test
  public void testTwoSum() {
    assertArrayEquals(new int[]{12, 9},
        new TwoSumProblem().twoSum(new int[]{1, 4, 5, 6, 3, 4, 7, 9, 10, 11, 45, 43, 32, 22}, 43));
  }
}


