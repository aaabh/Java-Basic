public class Sum{
  public static void main(String [] args){
    int [] arr = {10,14,13,17,16};
    int sum =0;
    for(int i = arr.length-1 ; i>=0 ; i--){
      sum += arr[i];
    }
    System.out.println(sum);
  }
}