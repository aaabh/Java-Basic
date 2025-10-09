public class FactorOfN {
    public static void factorOfN(int n){
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            System.out.println("i "+i);
            System.out.println("n/i "+n/i);

            if (n % i == 0) {
                System.out.print(" "+i + " ");
            }

            if (i != n / i) {
                System.out.print((n / i) + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 16;
        factorOfN(n);
    }
}
