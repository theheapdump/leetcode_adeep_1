package easy.arrays;

import java.util.HashMap;
import java.util.Map;

/*
 * Algorithm-
 * Loop over arrays
 * If (target - array element) exists in the map, add cur index to solution
 * The other index is the  index of the (target - array element's) index in Map
 * Else - add array element , index to Map
 */
public class TwoSumProblem {

  public int[] twoSum(int[] nums, int target) {
    int[] solution = new int[2];
    Map<Integer, Integer> numbers = new HashMap<>();
    int num1;
    for (int i = 0; i < nums.length; i++) {
      num1 = target - nums[i];
      if (!numbers.containsKey(num1)) {
        numbers.put(nums[i], i);
      } else {
        solution[0] = i;
        solution[1] = numbers.get(num1);
      }
    }
    return solution;
  }
}
