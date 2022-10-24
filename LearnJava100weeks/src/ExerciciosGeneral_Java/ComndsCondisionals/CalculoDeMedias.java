package ExerciciosGeneral_Java.ComndsCondisionals;

import java.util.Scanner;

// Faca um programa que leia tres numeros inteiros positivos e efetue o calculo de uma das ´
// seguintes medias de acordo com um valor num ´ erico digitado pelo usuario
public class CalculoDeMedias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual Media Escolher:");
        System.out.println("1- Med. Geometrica , 2- Med. Ponderada, 3- Med. Harmonica, 4- Med. Aritmetrica.");
        int operacao = input.nextInt();

        System.out.println("insira o valor de x:?");
        double valorX = input.nextDouble();
        System.out.println("insira o valor de y:?");
        double valorY = input.nextDouble();
        System.out.println("insira o valor de z:?");
        double valorZ = input.nextDouble();

        switch (operacao){
            case 1:
                double mediaGeometrica = Math.cbrt( valorX * valorY * valorZ );
                System.out.println("o valor da media geometrica: " + mediaGeometrica);
                break;
            case 2:
                double mediaPonderada = (( (valorX + 2) * (valorY + 3) * valorZ )/6);
                System.out.println("o valor da media ponderada: " + mediaPonderada);
                break;
            case 3:
                double mediaHarmonica = (1)/( (1/valorX) + (1/valorY) + (1/valorZ) );
                System.out.println("o valor da media harmonica: " + mediaHarmonica);
                break;
            case 4:
                double mediaAritmetrica = ( ( valorX + valorY + valorZ ) /3 );
                System.out.println("o valor da media aritmetrica: " + mediaAritmetrica);
                break;
            default:
                System.out.println("opcao invalida.");
        }
        input.close();
    }
}
