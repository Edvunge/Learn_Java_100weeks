package ExerciciosGeneral_Java.ComndsCondicionals;

import java.util.Scanner;

// Escreva um programa que, dada a idade de um nadador, classifique-o em uma das seguintes categorias:
// Categoria Idade
// Infantil_A 5 a 7
// Infantil_B 8 a 10
// Juvenil_A 11 a 13
// Juvenil_B 14 a 17
// Senior maiores de 18 anos
public class IdadeDoNadador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insira a idade do nadador:?");
        int idadeNadador = input.nextInt();

        if( idadeNadador >= 5 && idadeNadador <= 7 ){
            System.out.println("Infantil_A.");
        } else if( idadeNadador >= 8 && idadeNadador <= 10){
            System.out.println("Infantil_B.");
        } else if( idadeNadador >= 11 && idadeNadador <= 13){
            System.out.println("Juvenil_A.");
        } else if (idadeNadador >= 14 && idadeNadador <= 17) {
            System.out.println("Juvenil_B.");
        } else if(idadeNadador >= 18){
            System.out.println("SENIOR.");
        }
        input.close();
    }
}