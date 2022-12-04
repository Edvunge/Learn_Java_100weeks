package JavaComplt_OOP_Project.EstruturaRepeticao.Exercicio02;

import java.util.Scanner;
// 6) Leia a idade de 20 pessoas e exiba a soma das idades.
public class LerIdade20PessoasExibirSoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade, soma = 0;

        for (int i = 1; i <= 20; i++){
            System.out.println("insira a sua idade:?");
            idade = sc.nextInt();
            soma += idade;
        }
        System.out.printf("a soma das 20 idades e: %d",soma);
        sc.close();
    }
}