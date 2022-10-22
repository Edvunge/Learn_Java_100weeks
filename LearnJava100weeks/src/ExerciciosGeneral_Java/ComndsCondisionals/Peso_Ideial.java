package ExerciciosGeneral_Java.ComndsCondisionals;

import java.util.Scanner;

// Faca um programa que receba a altura e o sexo de uma pessoa e calcule e mostre seu
// peso ideal, utilizando as seguintes formulas (onde ´ h corresponde a altura):
//  Homens: (72.7 ∗ h) − 58
//  Mulheres: (62, 1 ∗ h) − 44, 7
public class Peso_Ideial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insira a altura:?");
        double altura = input.nextDouble();

        System.out.println("insira o sexo: Feminino(F) , Masculino(M):");
        String sexo = input.next();

        double peso_Ideial;
// exercicio por resolver.
        if(sexo.toUpperCase() == "F"){
            peso_Ideial = ( ( 62.1 * altura ) - 44.7);
            System.out.println("o seu pedo ideial e de: " + peso_Ideial);
        } else if (sexo.toUpperCase() == "M"){
            peso_Ideial = ( (72.7 * altura) - 58);
            System.out.println("o seu peso ideial e de: " + peso_Ideial);
        } else {
            System.out.println("Valor Invalido.");
        }
        input.close();
    }
}
