package ExerciciosGeneral_Java.VariableAndExpressions;

import java.util.Scanner;

// Leia um numero inteiro e imprima a soma do sucessor de seu triplo com o antecessor de ´
//seu dobro.
public class CalcSucessorAntecessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("indique um numero:?");
        int num = input.nextInt();

        int antecessor = num - 1;
        int sucessor = num + 1;

        int somaSUC = ((sucessor*sucessor*sucessor) + (antecessor*antecessor));
        System.out.println("a soma do sucessor de seu triplo com o antecessor de seu dobro: "+somaSUC);
        input.close();
    }
}
