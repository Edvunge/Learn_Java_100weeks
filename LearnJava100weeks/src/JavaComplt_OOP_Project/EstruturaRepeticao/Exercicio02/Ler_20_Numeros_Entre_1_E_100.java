package JavaComplt_OOP_Project.EstruturaRepeticao.Exercicio02;

import java.util.Scanner;

// 13) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.
public class Ler_20_Numeros_Entre_1_E_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        for (int i = 1; i <= 20; i++){
            System.out.println("insira um numero:?");
            num = sc.nextInt();

            if (num > 0 || num >= 100) {
                System.out.printf("os numeros sao: %d",i);
            }
        }
        sc.close();
    }
}