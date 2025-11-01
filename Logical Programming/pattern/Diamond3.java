package pattern;

/*
        *       *
        **     **
        ***   ***
        **** ****
        *********
*/


public class Diamond3 {
    public static void main(String[] args) {
        int n = 5;
        int sp = 2*n- (n/2+1);//14-(3+1) =10 // 10 - 3 = 7 // 6 - 2 = 4
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" * ");
            }
            for (int j = 1; j <= sp ; j++) {
                System.out.print("   ");
            }

            for (int j = 1; j <=i; j++) {
                if(j==n){
                    continue;
                }
                System.out.print(" * ");
            }

            System.out.println();
            sp-=2;
        }


    }
}
