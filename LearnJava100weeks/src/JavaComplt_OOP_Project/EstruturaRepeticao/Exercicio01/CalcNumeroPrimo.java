package JavaComplt_OOP_Project.EstruturaRepeticao;

import java.util.Scanner;

/*
    Faça um programa que peça um número inteiro e determine se ele é
    ou não um número primo. Um número primo é aquele que é divisível
    somente por ele mesmo e por 1.
*/
public class CalcNumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("insira um numero:?");
        int num = sc.nextInt();

        for(int i = 1; i > num; i++){
            // numero primo: numero % numero == 1
            if(num %i == 0) {
                System.out.println("e um numero primo.");
            } else {
                System.out.println("nao e um numero primo.");
            }
        }

        sc.close();
    }
}
