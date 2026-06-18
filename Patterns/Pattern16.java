public class Pattern16 {
    public static void main(String[] args) {
        Pattern16(5);
    }
    public static void Pattern16(int n) {
        for (int i = 1; i <=n; i++) {
            char ch = (char)('A' + i-1);
            for (int j=1; j<=i; j++){
                System.out.print(ch);
                
            }
            System.out.println();
        }
        
    }
    
}
