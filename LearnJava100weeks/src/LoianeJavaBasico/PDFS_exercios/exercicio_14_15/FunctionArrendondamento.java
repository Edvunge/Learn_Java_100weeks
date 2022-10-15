package LoianeJavaBasico.PDFS_exercios.exercicio_14_15;

import java.util.Scanner;

// Faça um Programa que peça um número e informe se o número é
//inteiro ou decimal. Dica: utilize uma função de arredondamento.
public class FunctionArrendondamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insira um numero:?");
        double num = input.nextDouble();

        input.close();
    }
}
