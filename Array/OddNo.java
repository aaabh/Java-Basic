public class OddNo {
  public static void main(String [] args){
    int [] arr = {13,11,12,14,18,17};
    for(int i = 0; i < arr.length; i++){
      if((arr[i] & 1) == 1 ){
        System.out.println(arr[i]);
      }
    }
  }
  
}
