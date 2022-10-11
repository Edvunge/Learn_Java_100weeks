package LoianeJavaBasico.PDFS_exercios.exercicio_11_12_13;

import java.util.Scanner;

// 13.Tendo como dados de entrada a altura e o sexo de uma pessoa,
//construa um algoritmo que calcule seu peso ideal, utilizando as
//seguintes fórmulas:
//. Para homens: (72.7*h) - 58
//a. Para mulheres: (62.1*h) - 44.7 (h = altura)
//b. Peça o peso da pessoa e informe se ela está dentro, acima ou
//abaixo do peso.
public class PesoIdeial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("qual a sua altura?");
        double altura = input.nextDouble();

        System.out.println("qual o seu sexo?");
        String sexo = input.next();

        if(sexo.toUpperCase() == "M"){
            double pesoIdeial = (72.7*altura)-58;
                if(pesoIdeial >= 65){
                    System.out.println("esta no peso ideial.");
                } else {
                    System.out.println("esta fora do peso ideial.");
                }
        } else  if(sexo.toUpperCase() == "F"){
            double pesoIdeial = (62.1*altura) - 44.7;
                if(pesoIdeial >= 65){
                    System.out.println("esta no peso ideial.");
                } else {
                    System.out.println("esta fora do peso ideial.");
                }
        }
        input.close();
    }
}