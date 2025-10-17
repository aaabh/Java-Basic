package Pattern;

public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for(int i = 1; i<=n; i++){
            num = i;
            for(int j = 1; j<=i; j++){
                System.out.print(num+" ");
                if(j == 1){
                    num += 2;
                }
                else{
                    num+=1;
                }
            }
            System.out.println();
        }
    }
}
