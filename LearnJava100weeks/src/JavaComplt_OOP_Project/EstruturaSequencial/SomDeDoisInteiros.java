package JavaComplt_OOP_Project.EstruturaSequencial;

import java.util.Scanner;

/*
Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
*/
public class SomDeDoisInteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("insira um numero inteiro:?");
        int num1 = sc.nextInt();

        System.out.println("insira um outro numero inteiro:?");
        int num2 = sc.nextInt();

        int soma = (num1 + num2);
        System.out.printf("\nO %d + %d e igual: %d",num1,num2,soma);
        sc.close();
    }
}
