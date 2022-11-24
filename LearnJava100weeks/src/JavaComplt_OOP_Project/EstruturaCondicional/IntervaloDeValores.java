package JavaComplt_OOP_Project.EstruturaCondicional;

import java.util.Scanner;
/*
você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
*/
public class IntervaloDeValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nInsira um valor qualquer inteiro:?\n");
        int num = sc.nextInt();

        if ( num >= 0 && num < 25 ) {
            System.out.printf("\nEncontra-se nesse intervalo: [0,25]");
        } else if ( num >= 25 && num < 50 ) {
            System.out.printf("\nEncontra-se nesse intervalo: [25,50]");
        } else if ( num >= 50 && num < 75 ) {
            System.out.printf("\nEncontra-se nesse intervalo: [50,75]");
        } else if ( num >= 75 && num < 100 ) {
            System.out.printf("\nEncontra-se nesse intervalo: [75,100]");
        } else {
            System.out.printf("\nFora de Intervalo.");
        }
        sc.close();
    }
}
