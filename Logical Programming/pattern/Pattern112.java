package pattern;
import java.util.Scanner;

public class Pattern112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter number ");
        int n = sc.nextInt();
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        for(int i = 2; i <=n; i++){
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        printDiamond(n);

    }

    public static void printDiamond(int n){
        int k ;
        for(int i = n; i >= 1; i++){
            int space = n-i;
            int j = 2*i-1;
            k =1;
            System.out.print("  ".repeat(space));
            System.out.println((k++ )+" ".repeat(j));
        }
        for(int i = 2; i <= n; i++){
            int spaces = n-i;
            int j = 2 * i - 1;
            k=1;
            System.out.print(" ".repeat(spaces));
            System.out.println((k++)+" ".repeat(j));
        }

    }
}

