package JavaComplt_OOP_Project.EstruturaRepeticao;
import java.util.Scanner;
/*
10. Faça um programa que receba dois números inteiros e gere os
números inteiros que estão no intervalo compreendido por eles.
*/
public class GerirDoisNumerosInteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("insira um numero inteiro:?");
        int n = sc.nextInt();

        System.out.println("insira um outro numero inteiro:?");
        int num = sc.nextInt();

        for (int i = n; i < num; i++) {
            System.out.println("-"+i);
        }
        sc.close();
    }
}