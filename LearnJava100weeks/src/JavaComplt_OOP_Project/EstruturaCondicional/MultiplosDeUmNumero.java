package JavaComplt_OOP_Project.EstruturaCondicional;

import java.util.Scanner;

/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
*/
public class MultiplosDeUmNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nInsira um numero inteiro:?");
        int num1 = sc.nextInt();

        System.out.println("\nInsira um outro numero inteiro:?");
        int num2 = sc.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }
        sc.close();
    }
}
