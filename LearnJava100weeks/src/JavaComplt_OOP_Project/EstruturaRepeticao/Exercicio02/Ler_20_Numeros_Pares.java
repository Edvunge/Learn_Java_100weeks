package JavaComplt_OOP_Project.EstruturaRepeticao.Exercicio02;

import java.util.Scanner;

// 12) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares
public class Ler_20_Numeros_Pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        for (int i = 1; i <= 20; i++){
            System.out.println("insira um numero:?");
            num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.printf("os numeros pares: %d",i);
            }
        }
        sc.close();
    }
}