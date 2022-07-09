package easy.others;

import java.util.Stack;

/*
 * Algorithm Odd number of Characters - return false
 * Use a Stack - if opening type - add to stack
 * if closing type - check if stack is not empty
 * & the top of the stack contains an opening of the same type - pop & break
 * continue looping
 * Check if stack is empty in the end else return true
 */
public class ValidParenthesis {

  public boolean isValid(String s) {
    if (s.isEmpty() || s.length() % 2 != 0) {
      return false;
    }
    Stack<Character> st = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
        st.push(s.charAt(i));
      } else {
        if (st.empty()) {
          return false;
        }
        switch (s.charAt(i)) {
          case ']':
            if (st.peek() == '[') {
              st.pop();
              break;
            } else {
              return false;
            }
          case '}':
            if (st.peek() == '{') {
              st.pop();
              break;
            } else {
              return false;
            }
          case ')':
            if (st.peek() == '(') {
              st.pop();
              break;
            } else {
              return false;
            }
        }
      }
    }
    return st.size() == 0;
  }
}