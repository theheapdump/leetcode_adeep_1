package easy.math;

import java.util.stream.IntStream;

/*
 * Algorithm :
 * Initialize All Elements Till "n" as primes
 * Loop from 2 to SqRoot(n)
 * If i is prime -> make all multiples of i till n as NON PRIME
 * Lastly count all primes left
 */
public class CountPrimes {

  public int countPrimes(int n) {
    int primes[] = new int[n];
    for (int i = 2; i < n; i++) {
      primes[i] = 1;
    }
    for (int i = 2; i < Math.sqrt(n); i++) {
      if (primes[i] == 1) {
        for (int j = 2; j * i < n; j++) {
          primes[j * i] = 0;
        }
      }
    }
    return (int) IntStream.of(primes).filter(p -> p == 1).count();
  }
}
