package JavaComplt_OOP_Project.EstruturaRepeticao.Exercicio02;

import java.util.Scanner;

// 7) Leia a idade de 20 pessoas e exiba a média das idades.
public class LerMediasDeIdadeDe20Pessoas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double mediaIdade = 0, soma = 0, idade;

        for (int i = 1; i <= 20; i++){
            System.out.println("insira a sua idade:?");
            idade = sc.nextDouble();

            soma += idade;
            mediaIdade = (soma/20);
        }
        System.out.printf("a soma das 20 idades e: %.2f",soma);
        System.out.printf("\nja a media das 20 idades e: %.2f",mediaIdade);
        sc.close();
    }
}