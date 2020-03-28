public class Prime {
  public static boolean isPrime(int num) {
      if (num < 2)
          return false;
      else {
          int numSqrd = (int) Math.sqrt(num);
          for (int i = 2; i <= numSqrd; i++){
              if (num % i == 0)
                  return false;
          }
      }
      return true;
  }
}
