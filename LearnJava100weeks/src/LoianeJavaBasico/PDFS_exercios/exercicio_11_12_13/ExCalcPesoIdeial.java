package LoianeJavaBasico.PDFS_exercios.exercicio_11_12_13;

import java.util.Scanner;

// 2.Tendo como dados de entrada a altura de uma pessoa, construa um
//algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
//(72.7*altura) - 58
public class ExCalcPesoIdeial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("qual a sua altura?");
        double altura = input.nextDouble();

        double pesoIdeial = (72.7*altura)-58;
        System.out.println("o peso ideial e "+pesoIdeial);
        input.close();
    }
}
