package UNINASSAU;

public class Questao10 {
    public static void main(String[] args) {
        int resultado=1;
        int s=1;
        while (s <= 9){
            resultado = resultado * s;
            s = s + 3;
        }
        resultado = resultado + 4;
        System.out.println(resultado);
    }
}
