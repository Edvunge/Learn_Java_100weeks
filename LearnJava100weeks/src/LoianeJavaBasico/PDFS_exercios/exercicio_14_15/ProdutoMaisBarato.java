package LoianeJavaBasico.PDFS_exercios.exercicio_14_15;

import java.util.Scanner;

// Faça um programa que pergunte o preço de três produtos e informe
//qual produto você deve comprar, sabendo que a decisão é sempre
//pelo mais barato.
public class ProdutoMaisBarato {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("indique um numero.");
        int num1 = input.nextInt();

        System.out.println("indique um outro numero.");
        int num2 = input.nextInt();

        System.out.println("indique um numero.");
        int num3 = input.nextInt();

        if(num1 < num2 && num1 < num3){
            System.out.println("o menor valor e: " + num1);
        } else if(num2<num3 && num2<num1){
            System.out.println("o menor valor e: " + num2);
        } else if(num3<num1 && num3<num2){
            System.out.println("o menor valor e: " + num3);
        }
        input.close();
    }
}
