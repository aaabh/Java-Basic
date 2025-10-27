package classObject;

public class MainClass6 {
  public static void main(String[] args) {
    Login l1 = new Login();
    l1.username = "admin";
    l1.password = "admin123";
    l1.login();

    System.err.println("-------------------");
    Login l2 = new Login();
    l2.username = "scott";
    l2.password = "tiger";
    l2.login();
    System.err.println("-------------------");

    Login l3 = new Login();
    l3.username = "guest";
    l3.forgotPasword();
  }
}
class Login{
  String username;
  String password;
  void login(){
    System.out.println("Login With Username "+username+" Password "+password);
  }
  void forgotPasword(){
    System.out.println("Recovery Link Sent To Registered Email of "+username);
  }
}
