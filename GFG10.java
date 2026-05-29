//Given four inputs that are stored in variables a, b, c, and d. 
//You need to write an expression to evaluate the following formula. 
//Use integer division. The expression should be a single statement.
//((a+b)/c)+d

import java.util.Scanner;

public class GFG10 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        // code here
        int ans= ((a+b)/c)+d;
        System.out.println(ans);
    }
    
}
