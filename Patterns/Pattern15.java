public class Pattern15 {
    public static void main(String[] args){
        Pattern15(5);
    }
    public static void Pattern15(int n){
        for(int i=1; i<=n; i++){
            for (char ch='A'; ch<'A'+i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    
}
