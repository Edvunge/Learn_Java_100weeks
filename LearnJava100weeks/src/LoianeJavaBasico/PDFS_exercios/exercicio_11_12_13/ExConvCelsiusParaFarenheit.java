package LoianeJavaBasico.PDFS_exercios.exercicio_11_12_13;
/*
10. Faça um Programa que peça a temperatura em graus Celsius,
transforme e mostre em graus Farenheit.
*/
import java.util.Scanner;

public class ExConvCelsiusParaFarenheit {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("insira um valor para graus Celsius: ");
        double grausCelsius = entrada.nextDouble();

        double grausFahrenheit = grausCelsius * (9.0/5.0) + 32.0;
        System.out.println("o resultado em graus Fahrenheit e: " + grausFahrenheit);
    }
}
