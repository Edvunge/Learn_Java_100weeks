package ExerciciosGeneral_Java.ComndsCondicionals;
// Escreva um programa que leia um numero inteiro maior do que zero e devolva, na tela, a
// soma de todos os seus algarismos. Por exemplo, ao numero 251 corresponder a o valor
// 8 (2 + 5 + 1). Se o numero lido nao for maior do que zero, o programa terminar a com a
// mensagem “Numero invalido”.

import java.util.Scanner;

public class SomaAlgarismos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insira um numero inteiro:?");
        int number = input.nextInt();

        if(number > 0){

        }
        System.out.println("numero inteiro maior do que zero: " + number);
        input.close();
    }
}
