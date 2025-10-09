public class isNeonNumber {
    /*A neon number is a number where the sum of digits of square of the number
    is equal to the number.
    The task is to check and print neon numbers in a range.*/

    /*
    Input : 9
    Output : Neon Number
    Explanation: square is 9*9 = 81 and
    sum of the digits of the square is 9.
    Input :12
    Output : Not a Neon Number
    Explanation: square is 12*12 = 144 and
    sum of the digits of the square is 9 (1+ 4 + 4) which is not equal to 12.
            */
    public static boolean isNeon(int n){
        int sum = 0, sq = n*n;
        while(sq>0){
            int rem = sq % 10;
            sum += rem;
            sq/= 10;
        }
        if(sum == n){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 9;
        if(isNeon(n))
            System.out.println("Neon ");
        else{
            System.out.println("Not neon");
        }
    }
}
