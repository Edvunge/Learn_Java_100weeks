package LoianeJavaBasico.PDFS_exercios.exercicio_14_15;

import java.util.Scanner;

// 2. Faça um Programa que peça um valor e mostre na tela se o valor é
//positivo ou negativo.
public class NumeroPositivoOuNegativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("indique um numero?");
        double numeroUM = entrada.nextDouble();

        if(numeroUM > 0){
            System.out.println("o numero digitado e positivo.");
        } else {
            System.out.println("o numero digitado e negativo.");
        }
        entrada.close();
    }
}
