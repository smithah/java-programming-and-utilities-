// Java program for the above approach
import java.util.*;
class GFG
{
  // Function to find distinct prime factor
  // of a number N
  static void distinctPrimeFactors(int N)
  {
    if (N < 2) {
      System.out.print(-1);
      return;
    }
    if (N == 2) {
      System.out.print(2);
      return;
    }
    HashMap<Integer, Boolean> visited = new HashMap<>();
    for (int i = 2; i * i <= N; i++) {
      while (N % i == 0) {
        if (!visited.containsKey(i)) {
          System.out.print(i + " ");
          visited.put(i, true);
        }
        N /= i;
      }
    }
    if (N > 2) {
      System.out.print(N);
    }
  }

  // Driver Code
  public static void main(String[] args)
  {
    int N = 315;
    distinctPrimeFactors(N);
  }
}
