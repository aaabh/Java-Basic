package pattern;
public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;
        n+= 'A';
        for (char a = 'A' ; a<=n-1; a++){
            for (char b = 'A'; b <=a ; b++) {
                System.out.print(b);
            }
            System.out.println();
        }
    }
}

/*
A
AB
ABC
ABCD
ABCDE
ABCDEF*/
