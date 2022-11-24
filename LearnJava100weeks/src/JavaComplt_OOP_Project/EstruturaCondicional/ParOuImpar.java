package JavaComplt_OOP_Project.EstruturaCondicional;

import java.util.Scanner;

// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nInsira um numero inteiro:?");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.printf("\nO %d e par.",num);
        } else {
            System.out.printf("\nO %d e impar.",num);
        }
        sc.close();
    }
}
