package ExerciciosGeneral_Java.ComndsCondisionals;

import java.util.Scanner;

//  Faca um programa que leia 2 notas de um aluno, verifique se as notas sao validas e ´
//  exiba na tela a media destas notas. Uma nota valida deve ser, obrigatoriamente, um ´
//  valor entre 0.0 e 10.0, onde caso a nota nao possua um valor valido, este fato deve ser ´
//  informado ao usuario e o programa termina.
public class NotasValidas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("ler nota um:");
        int nota1 = input.nextInt();

        System.out.println("ler nota dois:");
        int nota2 = input.nextInt();

        int mediaNotas = ( nota1 + nota2 / 2 );

        if (mediaNotas > 0 && mediaNotas < 10){
            System.out.println("notas validas.");
        } else {
            System.out.println("programa terminado.");
        }
        input.close();
    }
}
