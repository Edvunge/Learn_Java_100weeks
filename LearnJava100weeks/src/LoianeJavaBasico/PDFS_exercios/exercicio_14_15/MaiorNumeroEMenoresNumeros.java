package LoianeJavaBasico.PDFS_exercios.exercicio_14_15;

import java.util.Scanner;

//  Faça um Programa que leia três números e mostre o maior e o menor
//deles.
public class MaiorNumeroEMenoresNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("indique um numero.");
        int num1 = input.nextInt();

        System.out.println("indique um outro numero.");
        int num2 = input.nextInt();

        System.out.println("indique um numero.");
        int num3 = input.nextInt();

        // maiores entre os tres numeros
        if(num1 > num2 && num1 > num3){
            System.out.println("o maior valor e" + num1);
        } else if(num2>num3 && num2>num1){
            System.out.println("o maior valor e: " + num2);
        } else if(num3>num1 && num3>num2){
            System.out.println("o maior valor e: " + num3);
        }

        // menor numero entre os tres
        if(num1 < num2 && num1 < num3){
            System.out.println("o menor valor e" + num1);
        } else if(num2<num3 && num2<num1){
            System.out.println("o menor valor e: " + num2);
        } else if(num3<num1 && num3<num2){
            System.out.println("o menor valor e: " + num3);
        }
        input.close();
    }
}
