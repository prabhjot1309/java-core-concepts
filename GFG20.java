//Given a positive number n, print the string "GFG" exactly n times separated by a single space.
import java.util.Scanner;

public class GFG20 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        for(int i = 0 ; i < n ; i++){
            System.out.print(" GFG");
        }
        
    }
    
}
