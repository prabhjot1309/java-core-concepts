//Given a double value d, typecast it to an integer value and print it.
import java.util.*;

public class GFG7 {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();

        // code here
        int ans=(int)Math.floor(d);
        System.out.println(ans);
    }
    
}
