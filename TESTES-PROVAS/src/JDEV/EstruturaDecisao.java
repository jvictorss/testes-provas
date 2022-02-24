package JDEV;


import java.util.Scanner;

public class EstruturaDecisao {
    public static void main(String[] args) {
        int va1, va2, va3, vaFinal, media;

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a nota da 1ª VA: ");
        va1 = scan.nextInt();
        System.out.println("Insira a nota da 2ª VA: ");
        va2 = scan.nextInt();
        if ((va1 + va2) / 2 >= 7) {
            System.out.println("Aluno aprovado na 2ª VA. Não precisa fazer mais provas.");
        } else {
            System.out.println("A média foi menor que 7. Aluno precisa fazer 3ª VA.");
        }
        System.out.println("Insira a nota da 3ª VA: ");
        va3 = scan.nextInt();
        if ((va1 + va3) / 2 >= 7) {
            System.out.println("O aluno passou com as notas da 1ª e 3ª VA. Parabéns!");
        }
        if ((va2 + va3) / 2 >= 7) {
            System.out.println("O aluno passou com as notas da 2ª e 3ª VA. Parabéns!");
        } else {
            System.out.println("A nota do aluno não foi suficiente. É preciso fazer a VA Final.");
        }
        System.out.println("Insira a nota da VA Final: ");
        vaFinal = scan.nextInt();
        if ((va1 + va2 + va3 + vaFinal) / 4 >= 5) {
            System.out.println("Aluno aprovado após VA Final.");
        } else {
            System.out.println("Aluno reprovado.");
        }

        // Refatorar este código para switch case
    }
}
