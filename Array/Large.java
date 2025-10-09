public class Large{
    public static int large(int[] n){
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            if(large<n[i])
                large = n[i];
            else{
                large= n[i];
            }
        }
        return  large;
    }
    public static void main(String[] args){
        int [] arr ={1,22,34,-1,32,-322};
        System.out.println(large(arr));

  }
}