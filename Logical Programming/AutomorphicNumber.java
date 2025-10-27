public class AutomorphicNumber {
    public static boolean iAutomorphic(int n){
        int rem = 0;
        int p = (int)Math.pow(n,2);
        System.out.println("power" +p);
        int i = 0;
        while(p>0){
            if(true) {
                rem = p % 10;
                break;
            }
            p/=10;
        }
        System.out.println("rem "+rem);
        return rem == n;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println((iAutomorphic(n))?"Is":"not");

    }
}
