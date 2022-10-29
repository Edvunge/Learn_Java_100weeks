package ExerciciosGeneral_Java.ComndsCondicionals;

import java.util.Scanner;

// Escreva o menu de opcoes abaixo. Leia a opcao do usuario e execute a operacao escolhida.
// Escreva uma mensagem de erro se a opcao for invalida. ´
//Escolha a opcao:
//1- Soma de 2 numeros.
//2- Diferenca entre 2 numeros (maior pelo menor).
//3- Produto entre 2 numeros.
//4- Divisao entre 2 numeros (o denominador nao pode ser zero).
public class MenuEscolha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("qual operacao deseja escolher:");
        System.out.println("1- soma , 2- subtracao, 3- multiplicacao, 4- divisao.");
        int operacao = input.nextInt();

        switch (operacao){
            case 1:
                System.out.println("insira um numero:?");
                double num1 = input.nextDouble();

                System.out.println("insira um outro numero:?");
                double num2 = input.nextDouble();

                double soma = num1 + num2;
                System.out.println("a soma entre os dois numeros."+soma);
                break;
            case 2:
                System.out.println("insira um numero:?");
                num1 = input.nextDouble();

                System.out.println("insira um outro numero:?");
                num2 = input.nextDouble();

                if(num1 > num2){
                    double subtracao = num1 - num2;
                    System.out.println("o resultado da subtracao e: " + subtracao);
                } else if (num2 > num1) {
                    double subtracao = num2 - num1;
                    System.out.println("o resultado da subtracao e: " + subtracao);
                }
                break;
            case 3:
                System.out.println("insira um numero:?");
                num1 = input.nextDouble();

                System.out.println("insira um outro numero:?");
                num2 = input.nextDouble();

                double produto = num1 * num2;
                System.out.println("o resultado do produto e de: " + produto);
                break;
            case 4:
                //4- Divisao entre 2 numeros (o denominador nao pode ser zero).
                System.out.println("insira um numero:?");
                num1 = input.nextDouble();

                System.out.println("insira um outro numero:?");
                num2 = input.nextDouble();

                if( num2 != 0) {
                    double division = num1 / num2;
                    System.out.println("o resultado da divisao e de: " + division);
                } else {
                    System.out.println("numero invalido para o denominador.");
                }
                break;
            default:
                System.out.println("opcao invalida.");
        }
        input.close();
    }
}