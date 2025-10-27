package pattern;

public class Pattern111 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int k = 2*i-1; k >= 1; k--){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <=n ; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        printDiamond(n);
    }
    public static void printDiamond(int n){
        for (int i = 1; i <= 2*n-1; i++) {
            int space = Math.abs(n-i);
            int star = 2*(n-space)-1;

            System.out.print(" ".repeat(space));
            System.out.println("*".repeat(star));
        }
    }
}
