package ExerciciosGeneral_Java.ComndsCondicionals;

import java.util.Scanner;

// Faca um algoritmo que calcule o IMC de uma pessoa e mostre sua classificac¸ao de
//acordo com a tabela abaixo:
//IMC Classificacao
// < 18,5 Abaixo do Peso
// 18,6 - 24,9 Saudavel
// 25,0 - 29,9 Peso em excesso
// 30,0 - 34,9 Obesidade Grau I
// 35,0 - 39,9 Obesidade Grau II(severa)
// ≥ 40,0 Obesidade Grau III(morbida)
public class Calc_IMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insira a altura:?");
        double altura = input.nextDouble();

        System.out.println("insira o peso:?");
        double peso = input.nextDouble();

        // IMC = peso / (altura x altura).
        double IMC = peso / (altura * altura);

        if( IMC < 18.5 ){
            System.out.println("Abaixo do peso.");
        } else if( IMC <= 18.6 && IMC <= 24.9){
            System.out.println("Saudavel.");
        } else if( IMC <= 25.0 && IMC <= 29.9){
            System.out.println("Peso Excesso.");
        } else if (IMC <= 30.0 && IMC <= 34.9) {
            System.out.println("Obesidade Grau I.");
        } else if (IMC <= 35.0 && IMC <= 39.9) {
            System.out.println("Obesidade Severa.");
        } else if(IMC >= 40.0){
            System.out.println("Obesidade Morbida.");
        }
        input.close();
    }
}