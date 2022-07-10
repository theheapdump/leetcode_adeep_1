package easy.others;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PascalsTriangleTest {

  @Test
  public void testPascalsTriangle() {
    Assertions.assertEquals(
        List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1)),
        new PascalsTriangle().generate(4));
  }
}