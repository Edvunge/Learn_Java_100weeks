package JavaComplt_OOP_Project.EstruturaRepeticao.Exercicio02;

import java.util.Scanner;

// 5) Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.
public class Ler_10_Num_E_A_Sua_Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, soma = 0;

        for (int i = 1; i <= 10; i++){
            System.out.println("insira um numero:?");
            num = sc.nextInt();
            soma += num;
        }
        System.out.printf("a soma dos 10 numeros escolhidos pelo user e: %d",soma);
        sc.close();
    }
}
