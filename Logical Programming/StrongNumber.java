public class StrongNumber {
    /*
    * A Strong Number is a number in which the sum of the factorials of its digits equals the number itself.
    * Examples
    - 145 is a Strong Number:
    - 1! + 4! + 5! = 1 + 24 + 120 = 145
    - 2 is a Strong Number:
    - 2! = 2
    - 123 is not a Strong Number:
    - 1! + 2! + 3! = 1 + 2 + 6 = 9 ≠ 123

    */
    public static boolean isStrongNumber(int n){
        int sum = 0;
        int original = n;
        while(n>0){
            int rem = n%10;
            sum +=factorOfN(rem);
            n /=10;
        }
        return sum == original;
    }
    public static int factorOfN(int n){
        if (n == 0 || n == 1)
            return 1;
        return n* factorOfN(n-1);
    }

    public static void main(String[] args) {
        int n = 145;
        if (isStrongNumber(n)){
            System.out.println(n+" Strong Number");
        }
        else{
            System.out.println(n+" Not Strong Number");
        }
    }

}
