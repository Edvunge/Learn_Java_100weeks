package LoianeJavaBasico.PDFS_exercios.exercicio_11_12_13;

import java.util.Scanner;

// 3. Faça um Programa que peça dois números e imprima a soma.
public class ExSomaDoisNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite um numero?");
        int number1 = input.nextInt();

        System.out.println("digite um outro numero?");
        int number2 = input.nextInt();

        int soma = number1 + number2;
        System.out.println("a soma entre os numeros sao: " + soma);

        input.close();
    }
}
