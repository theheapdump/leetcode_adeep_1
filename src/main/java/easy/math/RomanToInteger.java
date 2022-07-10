package easy.math;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanToInteger {

  public int romanToInt(String s) {
    Map<Character, List<Character>> map = new HashMap<>();
    map.put('I', List.of('V', 'X'));
    map.put('X', List.of('L', 'C'));
    map.put('C', List.of('D', 'M'));
    Map<Character, Integer> val = new HashMap<>();
    val.put('I', 1);
    val.put('V', 5);
    val.put('X', 10);
    val.put('L', 50);
    val.put('C', 100);
    val.put('D', 500);
    val.put('M', 1000);
    char[] romans = s.toCharArray();
    int num = 0;
    int i = 0;
    for (; i < romans.length - 1; ) {
      if (map.containsKey(romans[i]) && map.get(romans[i]).contains(romans[i + 1])) {
        num += val.get(romans[i + 1]) - val.get(romans[i]);
        i += 2;
      } else {
        num += val.get(romans[i]);
        i++;
      }
    }
    if (i == s.length() - 1) {
      num += val.get(romans[i]);
    }
    return num;
  }
}
