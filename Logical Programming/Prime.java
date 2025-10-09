import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if(n%i == 0)
                return  false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1; i<=n; i++){
            if(isPrime(i)){
                System.out.println(i+" is Prime Number");
                count++;
            }
//            else{
//                System.out.println(i+" not Prime Number");
//            }
        }
        System.out.println(count+" is number between "+n);
    }
}
