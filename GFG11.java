//Given three integers a, d and n. Where a is the first term, d is the common difference of an A.P. 
// Calculate the nth term of A.P. 
//The nth term is given by an = a + (n-1)d

import java.util.Scanner;

public class GFG11 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        // code here
        int ans= a + (n-1)*d;
        System.out.println(ans);
        
    }
    
}
