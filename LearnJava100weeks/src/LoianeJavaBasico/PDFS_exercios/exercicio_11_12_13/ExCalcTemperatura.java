package LoianeJavaBasico.PDFS_exercios.exercicio_11_12_13;

import java.util.Scanner;

// 9. Faça um Programa que peça a temperatura em graus Farenheit,
//transforme e mostre a temperatura em graus Celsius.
//o C = (5 * (F-32) / 9)
public class ExCalcTemperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("qual a temperatura em graus Farenheit?");
        double grausFarenheit = entrada.nextDouble();

        double grausCelsius = (5 * (grausFarenheit - 32) / 9);
        System.out.println("o valor em graus celsuis e "+grausCelsius);
        entrada.close();
    }
}
