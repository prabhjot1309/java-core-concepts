public class pattern8 {
    public static void main(String[] args) {
        pattern8(4);
    }
    public static void pattern8(int n){
        for(int i=0; i<n;i++){
            // space
            for (int j=0; j<i; j++){
            System.out.print(" ");
            }

            //stars
             for (int j=0; j<2*(n-i)-1; j++){
            System.out.print("*");
            }
            //space
             for (int j=0;j<i; j++){
            System.out.print(" ");
            }

            System.out.println();
        }
    }
    
}
