public class Pallindrome1 {
    public static  boolean isPallindrome(int n){
        if(n<10|| n==0){
            return true;
        }
        int rev = 0;
        int ori = n;
        int rem = 0;
        while (n>0){
            rem = n%10;
            rev = rev + rem*10;
            n/=10;
        }
        return ori == rev;
    }

    public static void main(String[] args) {
        int n =1000;
        for (int i = 1; i <=n ; i++) {
            if (isPallindrome(i)) {
                System.out.println(i+" pallindrome");
            }
        }
    }
}
