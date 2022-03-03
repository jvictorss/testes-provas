package UFRPE;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumPerf {
    public static void main(String[] args) {

        List<Integer> divisores = new ArrayList<>();
        List<Integer> perfeitos = new ArrayList<>();
        Scanner perfeito = new Scanner(System.in);
        System.out.println("Insira o número para verificar se é perfeito: ");
        int tentativa = perfeito.nextInt();
        perfeito.close();
        if (tentativa % 2 != 0) {
            System.out.println("O número " + tentativa + " é ímpar. Até hoje não se tem notícias de um número ímpar ser perfeito.");
        } else {
            for (int i = 1; i < tentativa; i++) {
                if ((tentativa % i) == 0) {
                    divisores.add(i);
                }
            }
            System.out.println("Os divisores de "+ tentativa + " menores que ele são: " + divisores);
            int soma = 0;
            for (Integer i : divisores) {
                soma += i.intValue();
            } if (soma == tentativa) {
                System.out.println("A soma dos divisores de " + tentativa + ", exceto ele mesmo, é: " + soma);
                System.out.println(tentativa + " é um número perfeito.");
                perfeitos.add(tentativa);
            } else {
                System.out.println("A soma dos divisores de " + tentativa + " é: " + soma);
                System.out.println(tentativa + " não é um número perfeito");
            }
           // System.out.println(perfeitos);
        }
    }
}
