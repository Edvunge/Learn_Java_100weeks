package LoianeJavaBasico.PDFS_exercios.exercicio_11_12_13;

import java.util.Scanner;

// . Faça um Programa que calcule a área de um quadrado, em seguida
//mostre o dobro desta área para o usuário.
public class ExAreaDoQuadrado {
    public static void main(String[] args) {
        // area = lado x lado
        double lado = 2.3;
        double areaQuadrado = lado * lado;
        double dobroDaArea = (areaQuadrado * areaQuadrado);

        System.out.println("o valor do dobro da area do quadrado e:" + dobroDaArea);
    }
}
