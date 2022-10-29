package ExerciciosGeneral_Java.ComndsCondicionals;

import java.util.Scanner;

//  Faca um programa que mostre ao usuario um menu com 4 opcoes de operacoes ma- ˜
//tematicas (as basicas, por exemplo). O usuario escolhe uma das opcoes e o seu pro- ˜
//grama entao pede dois valores numericos e realiza a operacao, mostrando o resultado e ˜
//saindo.
public class QuatroOperacoes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int adition;
        int subtrat;
        int multiply;
        int division;

        System.out.println("indique ulor correspondente a operacao( 1:adicao , 2:sutraccao, 3:multiplicacao, 4:divisao )");
        int operacao = input.nextInt();
        switch (operacao){
            case 1:
                System.out.println("insira um valor:?");
                int valueA = input.nextInt();

                System.out.println("insira um outro valor:?");
                int valueB = input.nextInt();

                adition = (valueA + valueB);
                System.out.println(" o valor da soma e de:" + adition);
                break;
            case 2:
                System.out.println("insira um valor:?");
                int valueC = input.nextInt();

                System.out.println("insira um outro valor:?");
                int valueD = input.nextInt();

                subtrat = (valueC - valueD);
                System.out.println(" o valor da subtracao e de:" + subtrat);
                break;
            case 3:
                System.out.println("insira um valor:?");
                int valueE = input.nextInt();

                System.out.println("insira um outro valor:?");
                int valueF = input.nextInt();

                multiply = (valueE * valueF);
                System.out.println(" o valor da multiplicacao e de:" + multiply);
                break;
            case 4:
                System.out.println("insira um valor:?");
                int valueG = input.nextInt();

                System.out.println("insira um outro valor:?");
                int valueH = input.nextInt();

                division = (valueG / valueH);
                System.out.println(" o valor da divisao e de:" + division);
                break;
            default:
                System.out.println("valor da operacao invalido:");
        }
        input.close();
    }
}