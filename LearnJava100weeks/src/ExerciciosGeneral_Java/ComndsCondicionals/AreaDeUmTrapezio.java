package ExerciciosGeneral_Java.ComndsCondicionals;

import java.util.Scanner;

//  Faca um programa que calcule e mostre a area de um trapezio. Sabe-se que: ´
// A = (basemaior + basemenor) ∗ altura
// 2
//Lembre-se a base maior e a base menor devem ser numeros maiores que zero.
public class AreaDeUmTrapezio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insira um valor para a base maior:?");
        double baseMaior = input.nextDouble();

        System.out.println("insira um valor para a base menor:?");
        double baseMenor = input.nextDouble();

        double areaDoTrapezio;
        double baseMaiorAlterado;

        System.out.println("insira a altura do trapezio:?");
        double altura = input.nextDouble();

        if(baseMaior < 0 && baseMenor < 0){
            System.out.println("insira um outro valor para a base maior:?");
            baseMaiorAlterado = input.nextDouble();

            areaDoTrapezio = ( (baseMaior + baseMenor) * altura / 2 );
            System.out.println("a area do trapezio e igual: " + areaDoTrapezio);
        } else {
            areaDoTrapezio = ( (baseMaior + baseMenor) * altura / 2 );
            System.out.println("a area do trapezio e igual: " + areaDoTrapezio);
        }
        input.close();
    }
}
