package LoianeJavaBasico.PDFS_exercios.exercicio_14_15;

import java.util.Scanner;

/*
22. Faça um Programa que peça um número inteiro e determine se ele é
par ou impar. Dica: utilize o operador módulo (resto da divisão).
*/
public class Par_OU_Impar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("insira um numero:?");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.printf("o numero %d e par", num);
        } else {
            System.out.printf("o numero %d e impar", num);
        }
        sc.close();
    }
}