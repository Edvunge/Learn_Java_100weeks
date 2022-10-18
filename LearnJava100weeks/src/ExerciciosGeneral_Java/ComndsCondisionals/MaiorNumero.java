package ExerciciosGeneral_Java.ComndsCondisionals;

import java.util.Scanner;

// 1. Faca um programa que receba dois numeros e mostre qual deles ´ e o maior
public class MaiorNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insira um numero:?");
        int num1 = input.nextInt();

        System.out.println("insira um outro numero:?");
        int num2 = input.nextInt();

        if(num1>num2){
            System.out.println(num1+" e o maior numero.");
        } else {
            System.out.println(num2+" e o maior numero.");
        }

        input.close();
    }
}
