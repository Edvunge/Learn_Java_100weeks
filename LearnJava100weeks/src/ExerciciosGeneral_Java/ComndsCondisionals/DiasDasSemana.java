package ExerciciosGeneral_Java.ComndsCondisionals;

import java.util.Scanner;

// Usando switch, escreva um programa que leia um inteiro entre 1 e 7 e imprima o dia
//da semana correspondente a este numero. Isto e, domingo se ´ 1, segunda-feira se 2, e
//assim por diante.
public class DiasDasSemana {
    public static void main(String[] args){
        Scanner entrada =new Scanner(System.in);

        System.out.println("indique um inteiro entre 1 e 7 correspondente a cada dia da semana");
        int diaSemana = entrada.nextInt();

        switch (diaSemana){
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terca");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("numero invalido");

        }
        entrada.close();
    }
}
