public class Pattern1{
  public static void main(String[] args){
    // // 1*2*3
    // int n= 5;
    // int val = 1;
    // for(int i = 0;i<n; i++){
      
    //   if (i % 2 == 0) {
    //     System.out.print(val++ + " ");
    //   } else {
    //     System.out.print("* ");
    //   }
    // }
    // // A * B * C
    // int n = 5;
    // char ch = 'A';
    // for(int i = 0; i < n; i++){ 
    //   if (i % 2 == 0) {
    //     System.out.print(ch++ + " ");
    //   } else {
    //     System.out.print("* ");
    //   }
    // }

    int n = 5;
    int  val =1;

    for(int i = 0; i< n; i++)  {

      if(i == val/2 ){
        System.out.print(val++ + " ");
      } else {
        System.out.print(val-- +" ");
      }
    }
  }


}