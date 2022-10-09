package LoianeJavaBasico.PDFS_exercios.exercicio_11_12_13;

import java.util.Scanner;

// 2. Faça um Programa que peça um número e então mostre a
//mensagem O número informado foi [número].
public class ExNumeroSolicitado {
    public static void main(String[] args) {
        Scanner include = new Scanner(System.in);

        System.out.println("insira um numero qualquer?");
        int number = include.nextInt();

        System.out.println("o numero digitado foi: " + number);

        include.close();
    }
}
