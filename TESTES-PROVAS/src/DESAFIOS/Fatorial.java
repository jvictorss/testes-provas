package DESAFIOS;

import java.util.Scanner;

class Fatorial {

    private static int fatorial(int numFat) {
        if (numFat==1)
            return numFat;

        return (fatorial(numFat-1)*numFat);
    }

    public static void main(String[] args) {
        System.out.println("Insira o número que quer fatorar: ");
        Scanner numero = new Scanner(System.in);
//        System.out.println(fatorial(numero.next()));
    }
}

// Colocar scan para digitar o valor