//You need to perform three separate tasks based on the given input:
//String Input and Print: Read a string s (which may contain spaces) and print it as it is.
//Integer Input and Print: Read an integer n and print it without any change.
//Float Input and floor Print: Read a floating-point number as input, take its floor value, and print as an integer.

import java.util.Scanner;

public class GFG4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s;
        int n;
        float f;
        int ff; // To Store floor of float variable f

        // code here
        s = sc.nextLine();
        n = sc.nextInt();
        f = sc.nextFloat();
        ff = (int)Math.floor(f);

        System.out.println(s);
        System.out.println(n);
        System.out.println(ff);
    }
    
    
}
