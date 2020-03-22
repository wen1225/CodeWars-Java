class RowSumOddNumbers {
    public static int rowSumOddNumbers(int row) {
        //Get starting element of the row
        int start = 1;
        for (int i = 1; i < row; i++){
            start = start + i*2;
        }       
        //Sum all elements of the row
        int sum = 0;
        for (int i = 0; i < row; i++){
            sum = sum + (start + 2*i);
        }
        return sum;
    }
}

/* 
---------------Clever way to solve---------------
class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
    /* sum of consequent M numbers is (M+1)M/2, so 
     * we may know how many numbers were below
     * our ROW : numbersBelow = ((n-1)*(n))/2.
     * Now we may calculate first number in row:
     * firstNumberInRow = 2*numbersBelow+1.
     * So, firstNumberInRow = n*n-n+1 and
     * last number in ROW is n*n-n+1 + 2(n-1).
     * Let assume that last number before row is
     * x1 and last number in row is x2. It's known
     * that 1+3+5+...+(2k-1) = k*k.
     * Sum in row must be x2*x2 - x1*x1. 
     // OUR x1 = (n*n-n)/2 and x2 = (n*n+n)/2.
     * After some simplification: SUM = n*n*n. */
  return n*n*n;
  }
}
-------------------------------------------------
*/
