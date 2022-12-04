package JavaComplt_OOP_Project.EstruturaRepeticao;

import java.util.Scanner;

/*
14. Faça um programa que peça 10 números inteiros, calcule e mostre a
quantidade de números pares e a quantidade de números impares.
*/
public class Dez_Numeros_Pares_Impares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;

        for (i = 1; i <= 10; i++) {
              // pares (num % 2 == 0)
            if(i % 2 == 0) {
                System.out.println("numero par: " + i);
            } else {
                // impares: !(num % 2 == 0)
                System.out.println("numero impar: " + i);
            }
        }
        sc.close();
    }
}