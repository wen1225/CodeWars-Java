import java.util.*;
public class Solution
{
    public static int maxTriSum (int[] numbers)
    {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++){
            set.add(numbers[i]);
        }
        Iterator<Integer> it = set.descendingIterator();
        int sum = 0;
        for (int count = 0; count < 3 && it.hasNext(); count++){
            sum += it.next();
        }
        return sum;
    }
}
