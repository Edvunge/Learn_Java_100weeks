package JavaComplt_OOP_Project.EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
*/
public class CalcFigurasGeometricas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.println("insira o valor de a? , o valor de b? , valor de c:?");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // área do triângulo retângulo
        double areaTrianguloRetangulo = a * c;

        // área do círculo de raio
        double areaCirculo = ( PI * (c*c) );

        // área do trapézio
        double area = ( ( a + b ) / 2 ) * c;

        // área do quadrado
        double quadrado = ( b * b );

        // área do retângulo
        double areaRetangulo = (a * b);

        System.out.printf("\nA area do triangulo retangulo e igual a: %.2f",areaTrianguloRetangulo);
        System.out.printf("\nA area do circulo e igual a: %.2f",areaCirculo);
        System.out.printf("\no valor da area do trapezio e de: %.2f",area);
        System.out.printf("\nO resultado da area do quadrado e de: %.2f",quadrado);
        System.out.printf("\nA area do retangulo e igual a: %.2f\n",areaRetangulo);
        sc.close();
    }
}
