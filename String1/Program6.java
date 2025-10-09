package String1;

public class Program6 {
    public static void main(String[] args) {
        String str = "Engineering";
        System.out.println(str.contains("job"));//false
        System.out.println(str.contains("gin"));//true

        System.out.println(str.startsWith("Eng"));//true
        System.out.println(str.startsWith("eng"));//false

        System.out.println(str.endsWith("r ing"));//false
        System.out.println(str.endsWith("ing"));//true
    }
}
