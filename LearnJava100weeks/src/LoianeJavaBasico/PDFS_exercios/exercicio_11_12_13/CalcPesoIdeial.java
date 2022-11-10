package LoianeJavaBasico.PDFS_exercios.exercicio_11_12_13;

import java.util.Locale;
import java.util.Scanner;

/*
12. Tendo como dados de entrada a altura de uma pessoa, construa um
algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
(72.7*altura) - 58
*/
public class CalcPesoIdeial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("indique a altura?");
        double altura = input.nextDouble();

        double pesoIdeial =( (72.7*altura) - 58);

        System.out.printf(" o seu peso e de: %.2f" , pesoIdeial);
        input.close();
    }
}
