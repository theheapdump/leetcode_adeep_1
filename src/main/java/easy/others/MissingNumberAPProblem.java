package easy.others;

/*
 * Algorithm : Sum of nums.length numbers in AP = n * (n + 1)/2
 * Missing Number is AP sum - array sum
 */
public class MissingNumberAPProblem {

  public int missingNumber(int[] nums) {
    int sum2 = 0;
    for (int i : nums) {
      sum2 += i;
    }
    int  len = nums.length;
    return len * (len + 1) / 2 - sum2;
  }
}
