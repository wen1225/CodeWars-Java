import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
import java.lang.Math.*;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    int numCopy = num;
    int ans = 0;
    ArrayList<Integer> aList = new ArrayList<>();
    while (numCopy != 0){
      aList.add(numCopy % 10);
      numCopy /= 10;
    }
    Collections.sort(aList);
    for(int i = aList.size() - 1; i >-1; i--){
       ans = (int) (ans + (aList.get(i) * Math.pow(10, i)));
    }
    return ans;
  }
}  


 /******************************************************
  
    Suppose num = 145263
    
    VARIABLE DECLARATIONS (line: 8-10):
    line 8: numCopy is assigned num as a placeholder for
            num since we need to modify its value.
    line 9: aList is declared as a placeholder for each
            digits in numCopy.
            
    WHILE LOOP (line: 11-14): 
    In each iteration, the last digit is removed from
    numCopy and added to aList.
    
    line 11: while numCopy is not 0, repeat the loop.
             numCopy is 145263, so run the loop.
    line 12: numCopy % 10 gives 3 (last digit),
             then 3 is stored in aList where
             
             aList = [3]
             index:   0 
    line 13: numCopy /= 10 is equivalent to 
             numCopy = numCopy / 10 and the new value for
             numCopy is 14526. Go back to line 10.
    
    SORT (line 15):
    line 14: sorts aList in ascending order, so
    aList = [3, 6, 2, 5, 4, 1] becomes
    aList = [1, 2, 3, 4, 5, 6].
    
    FOR LOOP (line: 16-20):
    1st iteration:     [1, 2, 3, 4, 5, 6]
                   i:                  ^
                   answer = 6
    2nd iteration:     [1, 2, 3, 4, 5, 6]
                   i:               ^
                   answer = 65
    3rd iteration:     [1, 2, 3, 4, 5, 6]
                   i:            ^
                   answer = 654
                   
                   .
                   .
                   .
                   
     6th iteration:    [1, 2, 3, 4, 5, 6]
                   i:   ^
                   answer: 654321
     
     line 19: then return answer
     
******************************************************/
