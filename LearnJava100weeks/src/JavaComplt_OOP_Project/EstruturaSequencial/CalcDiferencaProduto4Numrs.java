package JavaComplt_OOP_Project.EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
*/
public class CalcDiferencaProduto4Numrs {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("insira um 1o inteiro:?");
        int num1 = sc.nextInt();
        System.out.println("insira um 2o numero inteiro:?");
        int num2 = sc.nextInt();
        System.out.println("insira um 3o numero inteiro:?");
        int num3 = sc.nextInt();
        System.out.println("insira um 4o numero inteiro:?");
        int num4 = sc.nextInt();

        double diferencaProduto = (int) ( ( num1 * num2 ) - ( num3 * num4 ) );

        System.out.printf("\nA diferenca do produto e igual a: %.2f",diferencaProduto);
        sc.close();
    }
}
