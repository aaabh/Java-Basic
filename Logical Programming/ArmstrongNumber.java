public class ArmstrongNumber {
    public static int counterDigit(int n){
        int count = 0;
        while(n>0){
            count ++;
            n/=10;
        }
        return count ;
    }
    public static int power(int n , int p){
        if(p==0|| p<10)
            return n;
        return n*power(n,p-1);
    }

    public static boolean isArmstrong(int n){
        int cd = counterDigit(n);
        int temp = n;
        int pow = 1;
        while(n>0){
            pow = power(n%10, cd);
            n/= 10;
        }
        return pow==temp;
    }
    public static void main(String[] args) {

    }
}
