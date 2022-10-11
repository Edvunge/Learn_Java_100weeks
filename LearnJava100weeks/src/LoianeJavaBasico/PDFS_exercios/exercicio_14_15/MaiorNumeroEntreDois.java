package LoianeJavaBasico.PDFS_exercios.exercicio_14_15;

import java.util.Scanner;

// Faça um Programa que peça dois números e imprima o maior deles.
public class MaiorNumeroEntreDois {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("indique um numero?");
        double num1 = entrada.nextDouble();

        System.out.println("indique um outro numero?");
        double num2 = entrada.nextDouble();

        if(num1 > num2){
            System.out.println("numero um e o maior numero.");
        } else{
            System.out.println("o segundo numero e maior.");
        }
        entrada.close();
    }
}
