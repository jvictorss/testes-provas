package UNINASSAU;

public class Questao2 {
    public static void main(String[] args) {
        int d=0;
        int w=3;
        while(w <= 12) {
            d=d*w;
            w=w+4;
        }
        d=d + 9-5;
        System.out.println(d);
    }
}
