package LoianeJavaBasico.PDFS_exercios.exercicio_11_12_13;

import java.util.Scanner;

/*
16. Faça um programa para uma loja de tintas. O programa deverá pedir o
tamanho em metros quadrados da área a ser pintada. Considere que a
cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a
tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
usuário a quantidades de latas de tinta a serem compradas e o preço
total.
 */
public class CalcTamanho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insira o tamanho em metros quadrados da área a ser pintada:?");
        double tamnahoPorPintar = input.nextDouble();


        /*
        Informe ao usuário:
        1. quantidades de latas de tinta?
        2. preço total?
        */
        input.close();
    }
}
