package JavaComplt_OOP_Project.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

/*
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.
*/
public class CalcDeQuadrante {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("\nInsira um valor para o eixo das abscissas (x):?\n");
        double eixoX = sc.nextDouble();

        System.out.println("\nInsira um valor para o eixo das ordenadas (y):?\n");
        double eixoY = sc.nextDouble();

        if ( (eixoX > 0.0 && eixoY > 0.0) ) {
            System.out.printf("\nEncontra-se no: Q1");
        } else if (eixoX == 0.0) {
            System.out.println("Eixo Y");
        } else if (eixoY == 0.0) {
            System.out.println("Eixo X");
        } else if ( (eixoX < 0.0 && eixoY > 0.0) ) {
            System.out.printf("\nEncontra-se no: Q2");
        } else if ( (eixoX < 0.0 && eixoY < 0.0) ) {
            System.out.printf("\nEncontra-se no: Q3");
        } else if(eixoX == 0.0 && eixoY == 0.0) {
            System.out.printf("\nEncontra-se na: Origem.");
        } else  {
            System.out.printf("\nEncontra-se no: Q4");
        }
        sc.close();
    }
}
