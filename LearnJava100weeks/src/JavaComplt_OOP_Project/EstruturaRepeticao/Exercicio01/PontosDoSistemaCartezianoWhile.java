package JavaComplt_OOP_Project.EstruturaRepeticao;

import java.util.Scanner;

/*
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
*/
public class PontosDoSistemaCartezianoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x,y;

        System.out.println("insira a coordenada X:");
        x = sc.nextDouble();

        System.out.println("insira a Abcissa y:");
        y = sc.nextDouble();

        while( x != 0 && y != 0 ){
            if ( (x > 0.0 && y > 0.0) ) {
                System.out.printf("\nEncontra-se no: Q1");
            } else if ( (x < 0.0 && y > 0.0) ) {
                System.out.printf("\nEncontra-se no: Q2");
            } else if ( (x < 0.0 && y < 0.0) ) {
                System.out.printf("\nEncontra-se no: Q3");
            } else  {
                System.out.printf("\nEncontra-se no: Q4");
            }
            System.out.printf("\nNovamente , insira a coordenada X:");
            x = sc.nextDouble();
            System.out.printf("\nNovamente , insira a Abcissa y:");
            y = sc.nextDouble();
        }
        sc.close();
    }
}
