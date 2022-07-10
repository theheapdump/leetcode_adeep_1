package easy.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CountPrimesTest {

  @Test
  public void testCountPrimes() {
    Assertions.assertEquals(1594, new CountPrimes().countPrimes(13455));
  }
}
