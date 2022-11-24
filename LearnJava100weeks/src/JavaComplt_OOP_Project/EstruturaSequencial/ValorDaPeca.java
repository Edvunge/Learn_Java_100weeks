package JavaComplt_OOP_Project.EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

codigo da peca1 ?
numero da peca1 ?
valor da peca1 ?

codigo da peca2 ?
numero da peca2 ?
valor da peca2 ?

*/
public class ValorDaPeca {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("insira codigo da peca1 ? , numero da peca1 ? , valor da peca1:?");
        int codigoPeca1 = sc.nextInt();
        int numPeca1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();

        System.out.println("insira codigo da peca2 ? , numero da peca2 ? , valor da peca2:?");
        int codigoPeca2 = sc.nextInt();
        int numPeca2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();

        double valorFinal = ( (numPeca1*valorPeca1) + (numPeca2*valorPeca2) );

        System.out.printf("\nO valor a pagar: R$ %.2f",valorFinal);
        sc.close();
    }
}
