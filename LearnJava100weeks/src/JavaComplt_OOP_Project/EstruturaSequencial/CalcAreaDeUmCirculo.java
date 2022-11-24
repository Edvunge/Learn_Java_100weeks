package JavaComplt_OOP_Project.EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

/*
    Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
    casas decimais conforme exemplos.

        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159
*/
public class CalcAreaDeUmCirculo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.println("insira o valor de um raio:?");
        double raio = sc.nextDouble();

        double areaCirculo = ( PI * (raio*raio) );

        System.out.printf("\nA area do circulo e igual a: %.4f",areaCirculo);
        sc.close();
    }
}
