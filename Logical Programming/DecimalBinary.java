public class DecimalBinary {
    public static int findBianry(int n){
        int binary =0;
        int place = 1;
        while(n>0){
          int rem = n%2;

          binary += rem * place;
          place *= 10;
          n/=2;

        }
        return  binary;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(findBianry(n));

    }
}
