package LoianeJavaBasico.PDFS_exercios.exercicio_16_17;

import java.util.Scanner;

// 7. Faça um programa que leia 5 números e informe o maior número.
public class MaiorEntreAs5Notas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int i = 0; i <= 5; i++){

            System.out.println("insira uma nota: ");
            double nota = input.nextDouble();
        }
        

        input.close();
    }
}
