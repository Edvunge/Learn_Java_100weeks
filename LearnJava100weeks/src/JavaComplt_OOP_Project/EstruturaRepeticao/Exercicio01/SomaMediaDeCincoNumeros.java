package JavaComplt_OOP_Project.EstruturaRepeticao;

import java.util.Locale;
import java.util.Scanner;

/*
8. Faça um programa que leia 5 números e informe a soma e a média dos números.
*/
public class SomaMediaDeCincoNumeros {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // por concluir.
        double num = 0, i = 0, soma = 0, media = 0;
        int t = 0;

        for(i = 0; i < 2; i++){
            System.out.println("insira um numero:?");
            t = sc.nextInt();
            soma = t + t;
        }
        System.out.println(soma);
        sc.close();
    }
}