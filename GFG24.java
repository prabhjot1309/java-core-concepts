//Count Digits in a Number
//Given a number n, return the count of digits in this number.

public class GFG24 {
        public static int countDigits(int n) {
        // Code here
         int count =0;
        if (n==0){
            count=1;
        }
        else{
            while(n>0){
                 count++;
            n= n/10;
            }
           
        }
        return count;
        
    }
    
}
