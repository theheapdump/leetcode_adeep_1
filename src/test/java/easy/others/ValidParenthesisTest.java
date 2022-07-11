package easy.others;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesisTest {

  @Test
  public void testValidParenthesis() {
    Assertions.assertFalse(new ValidParenthesis().isValid("{((({}{}{{})"));
    Assertions.assertTrue(new ValidParenthesis().isValid("{(([[]]{}))}"));
  }
}