class Purchase{
  public static void main(String[] args){
    int s1 = 200, s2 =300, s3 = 500, s4 = 400;
    int p1 = 500, p2 = 600, p3 = 700;
    float dis1 = ( s1 + s2 + s3 + s4 )* 20f/100;
    float dis2 = ( p1 + p2 + p3  )* 33f/100;
    float total = dis1 + dis2;
    System.out.println(total+" is total price");

  }
}