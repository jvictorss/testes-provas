package UFRPE;

import java.util.ArrayList;
import java.util.List;

public class NumCompostoOuPrimo {
    public static void main(String[] args) {
        List<Integer> divisores = new ArrayList<>();
        List<Integer> primos = new ArrayList<>();
        int divisor;
        int numPrimo = 6;

        //
        for (divisor = 1; divisor <= numPrimo; divisor ++) {
            if (numPrimo % divisor == 0) {
                divisores.add(divisor);
            }
        }
        primos.add(numPrimo);
        System.out.println(primos);
        if (divisores.size() == 2) {
            System.out.println("O número " + numPrimo + " é PRIMO. Seus divisores são: " + divisores);
        } else {
            System.out.println("O número " + numPrimo + " é COMPOSTO. Seus divisores são: " + divisores);
        }
    }
}
