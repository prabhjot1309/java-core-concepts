//Given two integer variables x and y. You need to perform the following operations:

//p = x + y, Addition
//q = x - y, Subtraction
//r = x * y, Multiplication
//s = x / y, Division
//t = x % y, Modulo
import java.util.Scanner;

public class GFG8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        // code here
        int p= x+y;
        int q= x-y;
        int r= x*y;
        int s=x/y;
        int t= x%y;
        

        // The below code prints the output
        System.out.println(p + " " + q + " " + r + " " + s + " " + t);
    }
    
}
