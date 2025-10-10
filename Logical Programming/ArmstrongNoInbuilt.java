public class ArmstrongNoInbuilt {
    public static boolean isArmstrong(int n){
        int count = (n+"").length();

        int sum = 0;
        int temp = n;
        while(n>0){
//            int power =(int) Math.pow(n%10,count);
            sum += Math.pow(n%10, count);
            n/=10;
        }
        return  sum == temp;
    }

    public static void main(String[] args) {
        int n =407;
        System.out.println((isArmstrong(n))?"Armstrong":"not");

    }
}
