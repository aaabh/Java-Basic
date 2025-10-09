public class PowerM{
  /*static int power(int n , int p){
    if (p == 0) return 1;
    if(p== 1) return n;

    return n* power(n,p-1);
  }*/

  public static void main(String[] args){
    double n = 4;
    int p = -1;

    
    System.out.println(power(n,p));
  }

//  this for larger values
    /*static long power(long n , int p){
        if(p == 0){
            return 1;
        }
        if(p== 1){
            return n;
        }
        long half = power(n,p/2);
        if(p%2 == 0){
            return half*half;
        }
        else{
            return n * half * half;
        }
    }*/

//    This is for negative number
    static double power(double n , int p){
        if(p==0)
            return 1.0;
        if(p==1){
            return n;
        }
        double half  = power(n,p/2);
        if(p%2 == 0){
            return half*half;
        }
        else if(p>0){
            return  n* half*half;
        }
        else{
            return (half*half)/n;
        }
    }

}