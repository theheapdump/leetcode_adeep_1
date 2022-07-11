package easy.others;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HammingDistanceTest {

  @Test
  public void testHammingDistance() {
    Assertions.assertEquals(5, new HammingDistance().hammingDistance(14,99));
  }
}
