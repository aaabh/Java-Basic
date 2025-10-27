public class Pattern1 {
    public static void main(String[] args) {
        int  n = 5;
        for(int i = 1; i<=5 ; i++){
            for(int j= 1; j<=5; j++){
//                System.out.print((j%2 == 0?1:0)+" ");
//                System.out.print(i%2);
                System.out.print((i==j || i+j-1 == n ?1:0)+" ");
            }
            System.out.println();
        }
    }
}
