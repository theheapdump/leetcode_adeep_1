package easy.math;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

  @Test
  public void testFizzBuzz() {
    Assertions.assertEquals(
        List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13",
            "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz", "Fizz", "22", "23", "Fizz", "Buzz",
            "26", "Fizz", "28", "29", "FizzBuzz", "31", "32", "Fizz", "34", "Buzz"),
        new FizzBuzz().fizzBuzz(35));

  }
}
