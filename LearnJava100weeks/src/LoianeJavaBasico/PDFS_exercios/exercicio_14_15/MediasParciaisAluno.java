package LoianeJavaBasico.PDFS_exercios.exercicio_14_15;

import java.util.Scanner;

//14.Faça um programa que lê as duas notas parciais obtidas por um aluno
//numa disciplina ao longo de um semestre, e calcule a sua média. A
//atribuição de conceitos obedece à tabela abaixo:
//o Média de Aproveitamento Conceito
//o Entre 9.0 e 10.0 A
//o Entre 7.5 e 9.0 B
//o Entre 6.0 e 7.5 C
//o Entre 4.0 e 6.0 D
//o Entre 4.0 e zero E
//O algoritmo deve mostrar na tela as notas, a média, o conceito
//correspondente e a mensagem “APROVADO” se o conceito for
//A, B ou C ou “REPROVADO” se o conceito for D ou E.
public class MediasParciaisAluno {
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