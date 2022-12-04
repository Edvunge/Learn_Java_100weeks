package JavaComplt_OOP_Project.EstruturaRepeticao;

import java.util.Scanner;

/*
    13. Faça um programa que peça dois números, base e expoente, calcule e
    mostre o primeiro número elevado ao segundo número. Não utilize a
    função de potência da linguagem.
*/
public class Funcao_Potencia_ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double mulp, potencia = 0, n = 0;

        System.out.println("insira um numero para a base:?");
        int base = sc.nextInt();

        System.out.println("insira um outro numero para o expoente:?");
        int expoente = sc.nextInt();

        potencia = base * expoente;
        /*for (int i = n; i <= 10; i++) {
            mulp = i * n;
            System.out.printf("\n%d * %d = %d",i ,n ,mulp);
        }*/

        System.out.println("potencia:" + potencia);
        sc.close();
    }
}