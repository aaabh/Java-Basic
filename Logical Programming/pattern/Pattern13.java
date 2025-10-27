package pattern;

public class Pattern13 {
    /*public static void main(String[] args) {
        String str = "JSPIDERS";
        char[] ch = str.toCharArray();
        for (int i = 1; i <= ch.length; i++) {
            for (int j = 0; j< i;j++ ){
                System.out.print(ch[j]);
            }
            System.out.println();
        }
    }*/
    public static void main(String[] args) {
        String str = "JSPIDERS";
        for (int i = 1; i <= str.length() ; i++) {
            System.out.println(str.substring(0,i));
        }
    }
}
