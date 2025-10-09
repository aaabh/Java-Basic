public class Program3{
  public static void main(String [] args){
    // for(int r = 1; r<=10; r+=2)
    //     System.out.println("Bangalore "+r);
    // for(int p = 10 ; p > 0 ; p-=3){
    //     System.out.println("Biriyani "+p);
      // }

    int n = 5;
      for(int i = 0; i< n; i++){
        for(int j = i; j< n; j++){
          System.out.print("* ");
        }
        System.out.println();   
      }
      
      for(int i = 0; i< n; i++){
        for(int j= 0; j<=i; j++){
          System.out.print("*"+" ");
        }
        System.out.println();
    }

    for(int i = 0; i< n;i++){
      for(int j = 0; j<= 2*(n-i) ;j++){
        System.out.print(" *");
      }
      System.out.println("#");
    }

    }
} 
