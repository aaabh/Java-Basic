package classObject;

public class MainClass8 {
    public static void main(String[] args) {
        Actor ref = new Actor();
        System.out.println(ref);
        ref.acting();

        Actor obj = null;
        System.out.println(obj);
        obj.acting();
    }
}
class Actor{
    void acting(){
        System.out.println("Actor.acting is good for actor");
    }
}
