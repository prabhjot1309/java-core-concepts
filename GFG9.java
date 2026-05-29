//Given an integer n. Write a program to return the last digit of the number.
import java.util.Scanner;

public class GFG9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        int ans= Math.abs(n%10);
        System.out.println(ans);
    }
}
