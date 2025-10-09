public class isSpy {
    // number whose sum and product of digits
    public static boolean isSpy(int n){

        int sum = 0, prod = 1;
        while(n>0){
            int rem = n%10;
            sum += rem;
            prod *= rem;
            n/=10;
        }
        if(sum == prod){
            return true;
        }
        return  false;
    }

    public static void main(String[] args) {
        int n= 1234;
        if(isSpy(n)){
            System.out.println("SpyNumber");
        }
        else
            System.out.println("Not SpyNumber");
    }
}
