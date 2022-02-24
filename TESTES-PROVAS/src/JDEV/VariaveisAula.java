package JDEV;

import org.w3c.dom.ls.LSOutput;

public class VariaveisAula {
    private static double total = 0;
    private static int produtos = 10;
    private static int quantidade = 15;

    private static String nome = "João Victor";
    private static int idade = 29;

    public static void main(String[] args) {
        total = produtos * quantidade;
        System.out.println(total);

        total = (produtos * quantidade) * 5;
        System.out.println(total);

        if (idade == 29) {
            System.out.println(nome);
        }
        idade = 30;

        if (idade == 30) {
            System.out.println(nome + " ainda não completou " + idade + " anos.");
        }
    }

}
