package easy.others;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumberAPProblemTest {

  @Test
  public void testMissingNumberAP() {
    Assertions.assertEquals(8,
        new MissingNumberAPProblem().missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));

  }
}