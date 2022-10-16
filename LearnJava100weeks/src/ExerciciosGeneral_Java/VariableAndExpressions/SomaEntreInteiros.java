package ExerciciosGeneral_Java.VariableAndExpressions;

import java.util.Scanner;

// 3. Peca ao usuario para digitar tres valores inteiros e imprima a soma deles.
public class SomaEntreInteiros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insira um numero?");
        int num1 = input.nextInt();

        System.out.println("insira um segundo numero?");
        int num2 = input.nextInt();

        System.out.println("insira um outro numero?");
        int num3 = input.nextInt();

        int SomaInteiros = (num1+num2+num3);
        System.out.println("a soma de inteiros e de: " + SomaInteiros);

        input.close();
    }
}
