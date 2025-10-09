public class SumOfDigit {
    public static int sumOfDigit(int n ,String s){
        int prod = 1;
        int count =0;
        int sum  = 0;

        while(n>0) {
            int mod=n%10;
            sum += mod;
            prod*=mod;

            count++;
            n/=10;
        }
        if (s.toLowerCase().substring(0).equals ("sum")){
            return sum;
        } else if (s.toLowerCase().substring(0).equals("product")) {
            return prod;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 103;

        System.out.println(n+"Sum of Digit "+sumOfDigit(n, "Sum"));
        System.out.println(n+"Product of Digit "+sumOfDigit(n, "Product"));
        System.out.println(n+"Count of Digit "+sumOfDigit(n, ""));
    }
}
