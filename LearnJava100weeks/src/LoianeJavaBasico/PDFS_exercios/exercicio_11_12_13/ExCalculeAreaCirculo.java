package LoianeJavaBasico.PDFS_exercios.exercicio_11_12_13;

import java.util.Scanner;

// 6. Faça um Programa que peça o raio de um círculo, calcule e mostre
//sua área.
public class ExCalculeAreaCirculo {
    public static void main(String[] args) {
        // area = pi * raio ao quadrado
        Scanner input = new Scanner(System.in);

        System.out.println("insira o valor da raio?");
        double raio = input.nextFloat();

        double PI = 3.1415;

        double areaCirculo = (PI * (raio*raio) );
        System.out.println("a area do circulo e: " + areaCirculo);
        input.close();
    }
}
