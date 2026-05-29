//Given two integers n and m, print a solid rectangle pattern of n rows and m columns using the "*" character.
import java.util.Scanner;

public class GFG21 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // code here
        for (int i=0; i<n; i++){
             for (int j=0; j<m; j++){
                 System.out.print("* ");
             }
             System.out.println();
        }
    }
    
}
