public class FabonacciNumber {
    public  static long fabo(long n){
        if(n== 0|| n== 1)
            return n;
        return fabo(n-1)+fabo(n-2);
    }

    public static void main(String[] args) {
        int n = 50;
        for (long i = 0L; i <n; i++) {
            System.out.println(i+"  "+fabo(i));
        }
    }
}
