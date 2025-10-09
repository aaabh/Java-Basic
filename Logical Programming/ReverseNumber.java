public class ReverseNumber {
    public static int reverse(int n){
        int reverse = 0;
        int sign = n < 0?-1:1;
        n = Math.abs(n);
        while(n>0){
            int rem = n%10;
            reverse = reverse*10+rem;
            n /= 10;
        }
        return reverse*sign;
    }

    public static void main(String[] args) {
        int n = -121;
        System.out.println("reverse "+reverse(n));
    }
}
