package LoianeJavaBasico.PDFS_exercios.exercicio_11_12_13;

import java.util.Scanner;

// 5. Faça um Programa que converta metros para centímetros.
public class ExConversorMetroSegundos {
    public static void main(String[] args) {
       //  3 x 100 = 300
        Scanner input = new Scanner(System.in);

        System.out.println("insira os metros?");
        double metros = input.nextFloat();

        double conversorMetrosPorCentimetros = (metros * 100);
        System.out.println("o valor da conversao de metros por centimetros e de: " + conversorMetrosPorCentimetros);
        input.close();
    }
}
