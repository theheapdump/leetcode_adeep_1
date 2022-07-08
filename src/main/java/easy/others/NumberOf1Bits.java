package easy.others;

//https://www.youtube.com/watch?v=Px1p0vq5Yic
public class NumberOf1Bits {

  /*
   * Brute Force Algorithm - By AND a number with 1, we can identify if the last bit is 1 or not.
   * If after AND number is 1 , increment count. Right Shift >>> "n" and do the same again
   *
   * Optimized Algorithm - AND a number "n" with "n-1" won't be 0 until count of the number of "1"s
   * in "n" are looped through to do n & n-1
   *
   * e.g. 9
   *    0000 1001 [9]
   * &  0000 1000 [8]
   * => 0000 1000 [8]
   * &  0000 0111 [7]
   * => 0000 0000 [0] STOP
   *
   * => Did 2 times & operation. Number of 1s in 9 (0000 1001) is also 2.
   */
  public int hammingWeight(int n) {
    int ct = 0;
    while(n != 0) {
      n = n & (n-1);
      ct += 1;
    }
    return ct;
  }
}
