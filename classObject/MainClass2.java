public class MainClass2 {
  public static void main(String[] args) {
    
    Employes e1 = new Employes();
    e1.eid =101;
    e1.ctc = 4.5;
    e1.work();
    e1.meeting();
    
    Employes e2 = new Employes();
    e2.eid =102;
    e2.ctc = 3.5;
    e2.work();
    e2.meeting();
    
  }
}
class Employes{
  int eid;
  double ctc;
  void work(){
    System.out.println("Working "+eid);
  }
  void meeting(){
    System.out.println("Meeting "+ctc);
  }
}
