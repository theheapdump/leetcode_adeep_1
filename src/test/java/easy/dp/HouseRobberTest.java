package easy.dp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HouseRobberTest {

  @Test
  public void testHouseRobber() {
    assertEquals(108, new HouseRobber().rob(
        new int[]{1, 6, 4, 8, 3, 4, 6, 7, 1, 2, 3, 9, 7, 5, 44, 5, 3, 4, 3, 2, 22}));
  }
}


