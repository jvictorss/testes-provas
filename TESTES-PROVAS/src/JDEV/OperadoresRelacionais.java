package JDEV;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;

        if (numero1 == numero2) {
            System.out.println("Os números " + numero1 + " e " + numero2 + " são iguais");
        } else {
            System.out.println("Os números " + numero1 + " e " + numero2 + " são diferentes");
        }

        if (numero1 != numero2) {
            System.out.println("Os números " + numero1 + " e " + numero2 + " são diferentes");
        } else {
            System.out.println("Os números " + numero1 + " e " + numero2 + " são iguais");
        }
    }
}
