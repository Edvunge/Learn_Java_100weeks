package JavaComplt_OOP_Project.EstruturaCondicional;

import java.util.Scanner;

// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
public class NegativoOuPositivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nInsira um numero inteiro:?");
        int num = sc.nextInt();

        if(num > 0){
            System.out.printf("\nO %d e positivo.",num);
        } else {
            System.out.printf("\nO %d e negativo.",num);
        }
        sc.close();
    }
}
