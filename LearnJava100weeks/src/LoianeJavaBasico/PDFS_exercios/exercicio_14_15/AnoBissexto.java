package LoianeJavaBasico.PDFS_exercios.exercicio_14_15;
import java.util.Scanner;
/*
17. Faça um Programa que peça um número correspondente a um
determinado ano e em seguida informe se este ano é ou não bissexto.
*/
public class AnoBissexto {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.printf("insira um ano:?\n");
        int ano = sc.nextInt();

        if(  (ano % 100 != 0) && (ano % 4 == 0) || (ano % 400 == 0)  ){
            System.out.printf("\nE um ano Bissexto.");
        } else {
            System.out.printf("\nNao E um ano Bissexto.");
        }
        sc.close();
    }
}