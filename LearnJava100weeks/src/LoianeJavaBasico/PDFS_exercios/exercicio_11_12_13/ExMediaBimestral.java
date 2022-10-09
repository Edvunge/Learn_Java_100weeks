package LoianeJavaBasico.PDFS_exercios.exercicio_11_12_13;

import java.util.Scanner;

// 4. Faça um Programa que peça as 4 notas bimestrais e mostre a média
public class ExMediaBimestral {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite o primeiro numero?");
        int primeiroNumero = entrada.nextInt();

        System.out.println("digite o segundo numero?");
        int segundoNumero = entrada.nextInt();

        System.out.println("digite o terceiro numero?");
        int terceiroNumero = entrada.nextInt();

        System.out.println("digite o quarto numero?");
        int quartoNumero = entrada.nextInt();

        int mediaBimestral = (primeiroNumero + segundoNumero + terceiroNumero + quartoNumero)/4;
        System.out.println( "a media bimestral e:" + mediaBimestral);

        entrada.close();
    }
}
