public class DecTools {
  public static int Digits(long n) {
      if (n > Long.MAX_VALUE || n < Long.MIN_VALUE)
          return -1;
      else if (n == 0)
          return 1;
      else {
          int numDigits = 0;
          while (n != 0){
              n /= 10;
              numDigits++;
          }
          return numDigits;
      }
  }
}
