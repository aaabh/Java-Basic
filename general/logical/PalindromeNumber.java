package logical;

public class PalindromeNumber {
    public static  boolean isPalindrome(int n){
        int reverse = 0;
        while(n>0){
            int digit = n%10;
            reverse *= (10*digit);
            n/=10;
        }
        if (n==reverse){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 1232;
        System.out.println((isPalindrome(n)?"palindrome":"not"));
    }
}
