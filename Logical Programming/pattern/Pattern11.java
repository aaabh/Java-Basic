package pattern;

public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print((char)(j+97)+" ");
            }
            System.out.println();
        }
    }
}
