import java.lang.Math;
public class Square {    
    public static boolean isSquare(int n) {
        return (Math.pow(Math.sqrt(n), 2) == n && Math.sqrt(n) % 1 == 0 && n >= 0) ? true : false;
    }
}
