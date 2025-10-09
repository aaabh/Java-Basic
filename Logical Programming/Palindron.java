import java.sql.SQLOutput;

public class Palindron {
    public static boolean isPalindron(int  n){
        StringBuilder rts = new StringBuilder();
        int orginal = n;
        while(n> 0){
            rts.append(n%10);
            n/=10;
        }

        if(orginal== Integer.parseInt(rts.toString())){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindron(1212));
    }
}
