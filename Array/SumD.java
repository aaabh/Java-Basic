public class SumD{
  public static void main(String [] args){
    double darr[] ={12.1,3.2,323.2,33.2};
    double sum  =0.0;
    for(int i = 0; i< darr.length; i++){
      sum = sum + darr[i];
    } 
    System.out.println(sum);
  }
}