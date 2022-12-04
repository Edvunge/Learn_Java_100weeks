package JavaComplt_OOP_Project.EstruturaRepeticao;

import java.util.Scanner;

/*
1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido.
*/
public class CalcNotaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("insira uma nota, entre zero e dez:?");
        num = sc.nextInt();

        while (num <= 0 || num > 10){
            System.out.println("valor invalido, insira o valor novamente:?");
            num = sc.nextInt();
        }
        sc.close();
    }
}