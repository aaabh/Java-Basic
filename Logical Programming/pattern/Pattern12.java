package pattern;

public class Pattern12 {
    public static void main(String[] args) {
        int n = 5;
//        int ch;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
//            ch = 'A';
            for (int j = 1; j <= 2*i-1; j++) {
//                System.out.print(((i%2 == 0) ? i:((char)(j+97)))+" ");
//                System.out.print(((i%2 == 0) ? i:ch++)+" ");
                if(i%2 == 0){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print((char)(j+64)+" ");
                }
            }
            System.out.println();
        }
    }
}

/*

PS D:\java core\Logical Programming\pattern> java Pattern12.java
        A
      2 2 2
    A B C D E
  4 4 4 4 4 4 4
A B C D E F G H I
*/
