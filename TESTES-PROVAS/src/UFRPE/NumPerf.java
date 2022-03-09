package UFRPE;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumPerf {
    public static void main(String[] args) {

        List<Integer> divisores;
        List<Integer> perfeitos = new ArrayList<>();
        Scanner perfeito = new Scanner(System.in);
        System.out.println("Insira o número para verificar se é perfeito: ");
        int busca = perfeito.nextInt();
        int count = 1;
        perfeito.close();
        if (busca % 2 != 0) {
            System.out.println("O número " + busca + " é ímpar. Até hoje não se tem notícias de um número ímpar ser perfeito.");
        } else {
            for (int tentativa = 1; tentativa <= busca; tentativa++) {
                if (count <= 3) { // Para descobrir os cinco primeiros, vou mudar este if para while e o contador para ser o busca no scanner e dizer quantos perfeitos eu quero.
                    int soma = 0;
                    divisores = new ArrayList<>();
                    for (int i = 1; i <= (tentativa / 2); i++) {
                        if ((tentativa % i) == 0) {
                            divisores.add(i);
                            soma += i;
                        }
                    }
                    System.out.println("Os divisores de " + tentativa + " menores que ele são: " + divisores);
                    if (soma == tentativa) {
                        count += 1;
                        System.out.println("---------------------------------------");
                        System.out.println("A soma dos divisores de " + tentativa + ", exceto ele mesmo, é: " + soma);
                        System.out.println(tentativa + " é um número perfeito.");
                        System.out.println("---------------------------------------");
                        perfeitos.add(tentativa);
                    } else {
                        System.out.println("A soma dos divisores de " + tentativa + " é: " + soma);
                        System.out.println(tentativa + " não é um número perfeito");
                    }
                }
            }
        }
    }
}
