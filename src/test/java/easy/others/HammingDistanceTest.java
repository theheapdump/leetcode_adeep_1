package easy.others;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class HammingDistanceTest {

  @Test
  public void testHammingDistance() {
    Assertions.assertEquals(5, new HammingDistance().hammingDistance(14,99));
  }
}
