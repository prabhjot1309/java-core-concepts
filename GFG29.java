//Given a positive number n. Find the sum of all the digits of n.
public class GFG29 {
        static int sumOfDigits(int n) {
        // code here
        int sum=0;
        while(n>0){
            sum += n%10;
            n /=10;
        }
        return sum;
    }
    
}
