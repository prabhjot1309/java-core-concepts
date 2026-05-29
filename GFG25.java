//Given a number n, print Floyd's triangle with n lines.

//Floyd’s Triangle is a pattern of consecutive natural numbers arranged in rows, where the i-th row contains i numbers.

import java.util.Scanner;

public class GFG25 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        int num =1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
        
    }
    
}
