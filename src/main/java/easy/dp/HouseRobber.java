package easy.dp;

/*
 * Algorithm:
 * If 1 house - rob that house, if  two houses rob the max cost house
 * Earning in 1 house = dp[0]
 * Earning in 2 houses = Max of those earnings
 * For every next house earning = Max(earning cur house + earnings till previous alternate house, earnings till previous house)
 */
public class HouseRobber {

  public int rob(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }
    if (nums.length == 2) {
      return Math.max(nums[0], nums[1]);
    }
    int dp[] = new int[nums.length];
    dp[0] = nums[0];
    dp[1] = Math.max(nums[0], nums[1]);
    for (int i = 2; i < nums.length; i++) {
      dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
    }
    return dp[nums.length - 1];
  }
}
