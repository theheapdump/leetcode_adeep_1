package easy.others;

//https://www.youtube.com/watch?v=UcoN6UjAI64
public class ReverseBits {

  /*
   * Algorithm -
   * 0. Initialize Reverse number R to 0
   * 1. Make Room for the Bit in the Reversed Number R i.e. R << 1
   * 2. Get Last Bit on Source Number i.e. bit = "n" & 1
   * 3. Put the Bit in the Source Number to the Room made in Reverse Number R i.e. R | "bit"
   * 4. Move to the next bit in the source number i.e. "n" >> 1
   * 5. Do this 32 times for a 32 bit integer
   */
  public int reverseBits(int n) {
    int rev = 0; // Step 0
    for (int i = 0; i < 32; i++) { // Step 5
      rev <<= 1; // Step 1
      rev |= (n & 1); // Step 2,3
      n >>= 1; // Step 4
    }
    return rev;
  }
}
