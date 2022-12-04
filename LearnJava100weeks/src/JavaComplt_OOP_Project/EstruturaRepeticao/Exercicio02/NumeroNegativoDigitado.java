package JavaComplt_OOP_Project.EstruturaRepeticao.Exercicio02;

import java.util.Scanner;

// 15) Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números.
// Encerre a execução quando um número negativo for digitado.
public class NumeroNegativoDigitado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, soma = 0;

        do {
            System.out.println("insira um numero:?");
            num = sc.nextInt();

            // o *-1 é para retirar o sinal negativo no final da operaçao,
            // assim evita valor negativono final do calculo
            soma = (num + num) *-1;
        } while (num > 0);
        System.out.printf("a soma dos numeros e: %d",soma);
        sc.close();
    }
}