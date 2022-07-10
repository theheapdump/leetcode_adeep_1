package easy.dp;

/*
 * Algorithm:
 * Start From 0 steps - there is 1 way to climb 0 steps - do not climb
 * 1 step there is 1 way - climb 1 step
 * 2 steps - there are 2 ways - come from step 0 + 2 steps or step 1 + 1 step
 * Hence dp[i] = dp[i - 1] + dp[i - 2];
 */
public class ClimbingStairs {

  public int climbStairs(int n) {
    int dp[] = new int[n + 1];
    dp[0] = 1;
    dp[1] = 1;
    for (int i = 2; i < n + 1; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
  }
}
