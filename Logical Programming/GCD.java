public class GCD {
    public static int findGCD(int a, int b){
        int gcd = 1;
        int small = (a<b)?a:b;
        for(int i = small ; i>=1; i--){
            if(a%i == 0 && b%i == 0){
                gcd=i;
                break;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 36;
        System.out.println(findGCD(a,b));
    }
}
