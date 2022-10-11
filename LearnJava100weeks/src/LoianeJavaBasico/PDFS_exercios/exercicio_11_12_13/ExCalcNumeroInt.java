package LoianeJavaBasico.PDFS_exercios.exercicio_11_12_13;
// 11.Faça um Programa que peça 2 números inteiros e um número real.
//Calcule e mostre:
//a. o produto do dobro do primeiro com metade do segundo .
//b. a soma do triplo do primeiro com o terceiro.
//c. o terceiro elevado ao cubo.

import java.util.Scanner;

public class ExCalcNumeroInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("indique o primeiro numero?");
        double num1 = input.nextInt();

        System.out.println("indique o segundo numero?");
        double num2 = input.nextInt();

        System.out.println("indique um outro terceiro numero?");
        double num3 = input.nextDouble();

        double prodDobr = (num1*(num1*num1)/num2);
        double somaTRI = ((num1*num1*num1) + num3);
        double terc = (num3*num3*num3);

        System.out.println("o produto do dobro do primeiro com metade do segundo"+prodDobr);
        System.out.println("a soma do triplo do primeiro com o terceiro"+somaTRI);
        System.out.println("o terceiro elevado ao cubo"+terc);
        input.close();
    }
}
