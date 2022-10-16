package ExerciciosGeneral_Java.VariableAndExpressions;

import java.util.Scanner;

//   Implemente um programa que calcule o ano de nascimento de uma pessoa a partir de
//   sua idade e do ano atual.
public class Calc_Idade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int AnoActual = 2022;

        System.out.println("indica a sua idade");
        int Idade = entrada.nextInt();

        int AnoNascmento = (AnoActual-Idade);
        System.out.println(" o seu ano de nascimento e: " + AnoNascmento);
        entrada.close();
    }
}
