package LoianeJavaBasico.PDFS_exercios.exercicio_14_15;

import java.util.Scanner;

// Faça um Programa que leia um número e exiba o dia correspondente
//da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
//aparecer valor inválido.
public class DiaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("inidique um numero.");
        int num = input.nextInt();

        switch (num){
            case 1:
                System.out.println("Domingo.");
                break;
            case 2:
                System.out.println("Segunda-Feira.");
                break;
            case 3:
                System.out.println("Terca-Feira.");
                break;
            case 4:
                System.out.println("Quarta-Feira.");
                break;
            case 5:
                System.out.println("Quinta-Feira.");
                break;
            case 6:
                System.out.println("Sexta-Feira.");
                break;
            case 7:
                System.out.println("Sabado.");
                break;
            default:
                System.out.println("Valor Invalido.");
        }

        input.close();
    }
}
