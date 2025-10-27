public class MainClass1{
  public static void main(String[] args){
    Student s1 = new Student();
    s1.name = "Rama";
    s1.cgpa = 9.4;
    s1.write();
    s1.study();
    
    Student s2 = new Student();
    s2.name = "Sita";
    s2.cgpa = 9.7;
    s2.write();
    s2.study();
    
  }
}

class Student
{
  String name ;
  double cgpa;
  void write(){
    System.out.println("Writing "+name);
  }
  void study(){
    System.out.println("Studing "+cgpa);
  }
}