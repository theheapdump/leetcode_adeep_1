package easy.others;

//https://www.youtube.com/watch?v=oGU1At1GFvc
public class HammingDistance {

  /*
   * Hamming Distance is the count of times when the bits do not match in the two numbers.
   * XOR is the trick
   *
   * Algorithm - Until one of the numbers is more than 0 , do
   * XOR the last bits of the two numbers (last bit is found by "n" % 2)
   * i.e. (x % 2) ^ (y % 2)
   * If the XOR is 1 i.e. bits are different -> add the xor result to the count
   */
  public int hammingDistance(int x, int y) {
    int ct = 0;
    while (x == 0 && y == 0) {
      ct += (x % 2) ^ (y % 2);
      x>>=1;y>>=1;
    }
    return  ct;
  }
}
