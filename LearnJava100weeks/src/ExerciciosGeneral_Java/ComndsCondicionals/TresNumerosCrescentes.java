package ExerciciosGeneral_Java.ComndsCondicionals;

import java.util.Scanner;

// Faca um programa que receba tres numeros e mostre-os em ordem crescente.
public class TresNumerosCrescentes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insira um valor:?");
        int value1 = input.nextInt();

        System.out.println("insira um outro valor:?");
        int value2 = input.nextInt();

        System.out.println("insira um valor:?");
        int value3 = input.nextInt();

        if(value1 > value2 && value1 > value3 && value2 > value3) {
            System.out.println("os numeros em ordem sao: " + value1 +" "+ value2 +" "+ value3);
        } else if(value2 > value1 && value2 > value3 && value1 > value3) {
            System.out.println("os numeros em ordem sao: " + value2 +" "+ value1 +" "+ value3);
        } else if(value3 > value1 && value3 > value2 && value1 > value2) {
            System.out.println("os numeros em ordem sao: " + value3 +" "+ value1 +" "+ value2);
        }
        input.close();
    }
}
