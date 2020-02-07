//My solution
import java.util.*;
public class Solution {
   public static int solution(int n) {
        Set<Integer> numList = new HashSet<>();
         int sum = 0;
        int tmp = 0;
        final int THREE = 3;
        final int FIVE = 5;
        //finding and adding all multiples of 3 under n
        for (int i = 2; i < n; i++)
        {
            tmp = 3 * i;
            if (tmp < n)
            numList.add(tmp);
            else
            break;
        }
        //finding and adding all multiples of 3 under n
        for (int i = 2; i < n; i++)
        {
            tmp = 5 * i;
            if (tmp < n)
            numList.add(tmp);
            else
            break;
        }
        //sum all numbers in numList
        for (Integer i : numList)
            sum += i;
         //finish up by adding the target multiple itself
        return sum + THREE + FIVE;
        }
    }

//Other Cleaner Solution:
public class Solution {
  public int solution(int number) {
    int sum=0;
    
    for (int i=0; i < number; i++){
      if (i%3==0 || i%5==0){sum+=i;}
    }
    return sum;
  }
}
