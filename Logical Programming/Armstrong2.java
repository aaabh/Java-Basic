public class Armstrong2 {
    public static boolean isArmstrong(int n){
        int cd = countDigit(n);
        int sum = 0;
        int temp = n;
        while(n>0){
            sum += power(n%10,cd);
            n/=10;
        }
        return  sum == temp;
    }
    public static int power(int n, int p){
        if(p==0)return 1;
        if(p==1 )return n;
        return n* power(n,p-1);
    }

    public static  int countDigit(int n){
        if(n==0||n<10) return 1;
        int count = 0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 1000;
        for (int i =1;i<=n;i++){
            if(isArmstrong(i)){
                System.out.println(i+ "is Armstrong");
            }
//            System.out.println(((isArmstrong(i)?"Armstrong":"not"))+i);
        }
    }
}
