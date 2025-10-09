package String1;

public class Program5 {
    public static void main(String[] args) {
        String str ="Karnataka";
        System.out.println(str.lastIndexOf('t'));
        System.out.println(str.lastIndexOf('n'));
        System.out.println(str.lastIndexOf('x'));
        int p = str.lastIndexOf('a');
        int q = str.lastIndexOf('a',p-1);
        int r = str.lastIndexOf('a',q-1);
        int s = str.lastIndexOf('a',r+1);
        System.out.println(" "+p+" "+q+" "+r+" "+s);
    }
}
