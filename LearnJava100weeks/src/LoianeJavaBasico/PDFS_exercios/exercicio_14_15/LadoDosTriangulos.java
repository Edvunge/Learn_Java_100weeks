package LoianeJavaBasico.PDFS_exercios.exercicio_14_15;

import java.util.Scanner;

// .Faça um Programa que peça os 3 lados de um triângulo. O programa
//deverá informar se os valores podem ser um triângulo. Indique, caso
//os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
//escaleno.
//o Dicas:
//o Três lados formam um triângulo quando a soma de quaisquer
//dois lados for maior que o terceiro;
//o Triângulo Equilátero: três lados iguais;
//o Triângulo Isósceles: quaisquer dois lados iguais;
//o Triângulo Escaleno: três lados diferentes;
public class LadoDosTriangulos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite o valor da primeira nota?");
        double nota1 = entrada.nextDouble();

        System.out.println("digite o valor da segunda nota?");
        double nota2 = entrada.nextDouble();

        double CalcMedia = ( ( nota1 + nota2 ) / 2 );
        if (CalcMedia >= 7 && CalcMedia < 9) {
            System.out.println("Aluno Aprovado.");
        } else if (CalcMedia < 7) {
            System.out.println("Aluno Reprovado.");
        } else if (CalcMedia >= 10){
            System.out.println("Aprovado com Distincao.");
        }

        entrada.close();
    }
}
