public class Pattern17 {
    public static void main(String[] args) {
        Pattern17(6);
    }
    public static void Pattern17(int n){
        for (int i=1; i<=n; i++){
            //spaces 
            for(int j=1; j<= n-i-1; j++){
                System.out.print(" ");
            }

            //Char
            char ch= 'A';
            int breakpoint = (2*i+1)/2;
            for (int j=1; j<= 2*i+ 1; j++ ){
                System.out.print(ch);
                if(j<= breakpoint){
                    System.out.print(ch++);
                }else{
                    System.out.print(ch--);
                }


            }

            //spaces
            for(int j=1; j<= n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
