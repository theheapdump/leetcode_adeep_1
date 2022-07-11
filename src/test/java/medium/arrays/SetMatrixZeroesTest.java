package medium.arrays;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SetMatrixZeroesTest {

  @Test
  public void testSetMatrixZeros() {
    int[][] input = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    new SetMatrixZeroes().setZeroes(input);
    Assertions.assertTrue(Arrays
        .deepEquals(new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}}, input));

    input = new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
    new SetMatrixZeroes().setZeroes(input);
    Assertions.assertTrue(Arrays
        .deepEquals(new int[][]{{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}}, input));
  }
}
