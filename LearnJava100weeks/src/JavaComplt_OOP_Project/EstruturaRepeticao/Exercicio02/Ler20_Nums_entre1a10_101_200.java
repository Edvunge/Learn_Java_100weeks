package JavaComplt_OOP_Project.EstruturaRepeticao.Exercicio02;

import java.util.Scanner;

// 14) Faça um algoritmo que leia 20 números e, ao final,
// escreva quantos estão entre 0 e 100, quantos estão entre 101 e 200 e quantos são maiores de 200.
public class Ler20_Nums_entre1a10_101_200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        for (int i = 1; i <= 20; i++){
            System.out.println("insira um numero:?");
            num = sc.nextInt();

            if (num > 0 || num >= 100) {
                System.out.printf("\nos numeros entre 0 e 100 sao: %d",i);
            }

            if (num > 101 || num >= 200) {
                System.out.printf("\nos numeros entre 101 e 200 sao: %d",i);
            }

            if (num > 200) {
                System.out.printf("\nos numeros maiores que 200 sao: %d",i);
            }
        }
        sc.close();
    }
}