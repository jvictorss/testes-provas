package JDEV;

public class OperadoresLogicos {

    public static void main(String[] args) {
        boolean numero1 = true;
        boolean numero2 = false;
        boolean numero3 = false;

        if (numero1 || numero2){
            System.out.println("Entrou na condição 1");
        } if (!numero3) {
            System.out.println("Entrou na condição 2");
        }
    }

}
