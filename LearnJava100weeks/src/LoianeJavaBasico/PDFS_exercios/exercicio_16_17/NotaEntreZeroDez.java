package LoianeJavaBasico.PDFS_exercios.exercicio_16_17;

import java.util.Scanner;

//  Faça um programa que peça uma nota, entre zero e dez. Mostre uma
//mensagem caso o valor seja inválido e continue pedindo até que o
//usuário informe um valor válido.
public class NotaEntreZeroDez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota;
        do {
            System.out.println("insira um valor entre 0 e 10: ");
            nota = input.nextInt();
            nota++;
        } while (nota <= 10);
    input.close();
    }
}
