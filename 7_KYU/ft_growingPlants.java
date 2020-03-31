import org.apache.commons.lang3.Range;

public class SimpleFun {
    public static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        //1. Check input constraints first.
        Range<Integer> pRange = Range.between(5, 100);
        Range<Integer> nRange = Range.between(2, upSpeed - 1);
        Range<Integer> hRange = Range.between(4, 1000);
        if (!pRange.contains(upSpeed) || !nRange.contains(downSpeed) || !hRange.contains(desiredHeight))
            return -1;
        //2. If here, means input is valid so proceed.
        else{
            int height = 0;
            int day = 0;
            while (height < desiredHeight){
                day++;
                height += upSpeed;
                if (height >= desiredHeight)
                    break;
                height -= downSpeed;
            }
            return day;
        }
    }
}
