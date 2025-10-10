package String1;

public class Split {
    public static void main(String[] args) {
        String str = "Qspider Jspider Pyspider Prospider";
        String [] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
