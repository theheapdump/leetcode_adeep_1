package easy.others;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ValidParenthesisTest {

  @Test
  public void testValidParenthesis() {
    Assertions.assertFalse(new ValidParenthesis().isValid("{((({}{}{{})"));
    Assertions.assertTrue(new ValidParenthesis().isValid("{(([[]]{}))}"));
  }
}