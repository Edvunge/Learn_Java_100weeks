package LoianeJavaBasico.PDFS_exercios.exercicio_11_12_13;

import java.util.Locale;
import java.util.Scanner;

/*
13. Tendo como dados de entrada a altura e o sexo de uma pessoa,
construa um algoritmo que calcule seu peso ideal, utilizando as
seguintes fórmulas:
. Para homens: (72.7*h) - 58
a. Para mulheres: (62.1*h) - 44.7 (h = altura)
b. Peça o peso da pessoa e informe se ela está dentro, acima ou
abaixo do peso.
*/
public class CalcPesoAndSex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("indique a altura?");
        double altura = input.nextDouble();

        System.out.println("Escolha: 1- Sexo Masculino / 2- Sexo Feminino: ");
        int sexo = input.nextInt();

        if(sexo == 1){
            double pesoIdeialFemenino = ( (72.7*altura) - 58);
            System.out.printf(" o seu peso e de: %.2f" , pesoIdeialFemenino);
        } else if (sexo == 2) {
            double pesoIdeialMasculino = ( (62.1*altura) - 44.7);
            System.out.printf(" o seu peso e de: %.2f" , pesoIdeialMasculino);
        } else {
            System.out.println("caractere invalido.");
        }
        input.close();
    }
}