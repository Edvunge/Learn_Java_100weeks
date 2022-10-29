package ExerciciosGeneral_Java.ComndsCondicionals;

import java.util.Scanner;

//  Faca um programa que receba um numero inteiro e verifique se este numero e par ou ımpar.
public class Par_Impar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insira um numero:");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("e par: " + num);
        } else {
            System.out.println("e impar: " + num);
        }
        input.close();
    }
}
