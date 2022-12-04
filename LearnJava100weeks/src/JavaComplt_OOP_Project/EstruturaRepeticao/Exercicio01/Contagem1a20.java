package JavaComplt_OOP_Project.EstruturaRepeticao;

import java.util.Scanner;

/*
6.  Faça um programa que imprima na tela os números de 1 a 20, um
    abaixo do outro. Depois modifique o programa para que ele mostre os
    números um ao lado do outro.
*/
public class Contagem1a20 {
    public static void main(String[] args) {

        // um abaixo do outro
        for(int i = 1; i <= 20; i++){
            System.out.println(i);
        }

        // números um ao lado do outro
        for(int i = 1; i <= 20; i++){
            System.out.print(i+"-");
        }
    }
}