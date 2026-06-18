public class Pattern19 {
    public static void main(String[] args){
        Pattern19(5);
    }
    public static void Pattern19(int n){
        int intiS = 0;

// Upper Half
for (int i = 1; i <= n; i++) {

    for (int j = 1; j <= n - i + 1; j++) {
        System.out.print("*");
    }

    for (int j = 1; j <= intiS; j++) {
        System.out.print(" ");
    }

    for (int j = 1; j <= n - i + 1; j++) {
        System.out.print("*");
    }

    intiS += 2;
    System.out.println();
}

intiS = 2 * n - 2;

// Lower Half
for (int i = 1; i <= n; i++) {

    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }

    for (int j = 1; j <= intiS; j++) {
        System.out.print(" ");
    }

    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }

    intiS -= 2;
    System.out.println();
}
    }
}
