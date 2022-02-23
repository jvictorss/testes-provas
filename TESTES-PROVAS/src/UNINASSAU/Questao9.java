package UNINASSAU;

public class Questao9 {
    public static void main(String[] args) {
        int h=0;
        int U=5;
        int x=3;
        while(h <= (U+9)) {
            h=h+x+2;
            x=x+3;
        }
        System.out.println(h);
    }
}
