package pattern;

public class Pattern114 {
    public static void printDiamond(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int space = Math.abs(n - i);
            int star = 2 * (n - space) - 1;

            System.out.print(" ".repeat(space));
            System.out.println("*".repeat(star));
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printDiamond(n);
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i >=1 ; i--) {
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
