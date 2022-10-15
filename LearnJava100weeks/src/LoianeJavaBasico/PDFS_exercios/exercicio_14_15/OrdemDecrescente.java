package LoianeJavaBasico.PDFS_exercios.exercicio_14_15;

import java.util.Scanner;

//  Faça um Programa que leia três números e mostre-os em ordem
//decrescente.
public class OrdemDecrescente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("indique um numero?");
        int num = input.nextInt();

        System.out.println("indique um segundo numero?");
        int num1 = input.nextInt();

        System.out.println("indique um outro numero?");
        int num2 = input.nextInt();

        if( ((num2>num1) && (num2>num)) && (num1 > num)  ){
            System.out.println(num2 + " ");
            System.out.println(num1 + " ");
            System.out.println(num + " ");
        } else if( ((num1>num) && (num1>num2)) && (num > num2)  ){
            System.out.println(num1 + " ");
            System.out.println(num + " ");
            System.out.println(num2 + " ");
        } else if( ((num>num1) && (num>num2)) && (num2 > num1)  ){
            System.out.println(num + " ");
            System.out.println(num2 + " ");
            System.out.println(num1 + " ");
        }

        input.close();
    }
}
