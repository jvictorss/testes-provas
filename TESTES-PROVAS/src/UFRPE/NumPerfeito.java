package UFRPE;
/*
 Um número perfeito é um número inteiro para o qual a soma de todos os
 seus divisores positivos próprios (excluindo ele mesmo) é igual ao próprio número
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class NumPerfeito {

    public static void main(String[] args) {
//        System.out.println("Insira o número: ");
//        Scanner x = new Scanner(System.in);
//        x.nextInt();
        int y = 1;
        int numPerf = 5000;
        while (y <= numPerf) {
            List<Integer> resultado = validarNumero(y);
            if (resultado.isEmpty()) {
//                System.out.println("Número " + y + " não é perfeito");
            } else {
                System.out.println(resultado);
                System.out.println("O número " + y + " é perfeito");
            }
            y++;
        }
    }
    private static List<Integer> validarNumero(int perfeito) {
        int soma = 1;
        int metade = perfeito;
        if (metade % 2 == 0){
            List<Integer> divisores = new ArrayList<>();
            int menor = 1;
            divisores.add(menor);
            while(metade % 2 == 0 && perfeito % metade == 0){
                menor *= 2;
                soma += menor;
                metade /= 2;
                soma += metade;
                divisores.add(metade);
                divisores.add(menor);
            }
            if (soma == perfeito) {
                Collections.sort(divisores);
                return divisores;
            } else {
                return Collections.emptyList();
            }
        } else {
            return Collections.emptyList();
        }
    }
}