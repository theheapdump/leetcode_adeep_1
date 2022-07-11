package easy.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountPrimesTest {

  @Test
  public void testCountPrimes() {
    Assertions.assertEquals(1594, new CountPrimes().countPrimes(13455));
  }
}
