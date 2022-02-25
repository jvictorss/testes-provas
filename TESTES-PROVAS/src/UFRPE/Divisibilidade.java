package UFRPE;


public class Divisibilidade {
    public static void main(String[] args) {

        int numeroPar;

        // Divisibilidade por 2:
        System.out.println("O número x é dito divisível por 2 se x for par.");
        int divpor2 = 4;

        if (divpor2 % 2 == 0) {
            System.out.println("O número " + divpor2 + " é divisível por 2.");
        } else {
            System.out.println("O número " + divpor2 + " não é divisível por 2.");
        }

        // Divisibilidade por 3:
        System.out.println("O número x é dito divisível por 3 quando a soma dos algarismos que o compõe resulta em um número múltiplo de 3.");
        System.out.println("Ou também se o resto da divisão do número x por 3 for igual a 0.");
        int divpor3 = 15;
        //Loop para identificar os múltiplos de 3 entre 0 e o número digitado.
        for (int i = 1; i <= divpor3; i+=3) {
            if ((i % 3) == 0) {
                System.out.println(i);
            }
        }
        if ((divpor3 % 3) == 0) {
            System.out.println("O número " + divpor3 + " é divisível por 3.");
        } else {
            System.out.println("O número " + divpor3 + " não é divisível por 3.");
        }

        //Divisibilidade por 4:
        System.out.println("O número x é dito divisível por 3 quando os seus algarismos das unidades e das dezenas formarem um número divisível por 4.");
        System.out.println("Ou também se o resto da divisão do número x por 3 for igual a 0.");

        int divpor4 = 68;

        if ((divpor4 % 4) == 0) {
            System.out.println("O número " + divpor4 + " é divisível por 4.");
        } else {
            System.out.println("O número " + divpor4 + " não é divisível por 4.");
        }
    }
}
