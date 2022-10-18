package ExerciciosGeneral_Java.VariableAndExpressions;

import java.util.Scanner;

/*
   Sejam a e b os catetos de um triangulo, onde a hipotenusa ˆ e obtida pela equac¸ ´ ao: ˜
   hipotenusa = √a2 + b2. Faca um programa que receba os valores de a e b e calcule
   o valor da hipotenusa atraves da equacao. Imprima o resultado dessa operacao.
*/
public class ValorDaHipotenusa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insira o valor de B:?");
        double valorB = input.nextDouble();

        System.out.println("insira o valor de A:?");
        double valorA = input.nextDouble();

        double calcHipotenusa = Math.sqrt(((valorA)*(valorA)+((valorB)*(valorB))));

        System.out.println("o calculo da hipotenusa: "+calcHipotenusa);
        input.close();
    }
}
