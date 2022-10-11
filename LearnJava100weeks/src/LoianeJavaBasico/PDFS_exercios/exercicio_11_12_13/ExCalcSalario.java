package LoianeJavaBasico.PDFS_exercios.exercicio_11_12_13;

import java.util.Scanner;

//8. Faça um Programa que pergunte quanto você ganha por hora e o
//número de horas trabalhadas no mês. Calcule e mostre o total do seu
//salário no referido mês.
public class ExCalcSalario {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("quanto voce ganha por hora?");
        double valorHora = entrada.nextDouble();

        System.out.println("qual e o numero de horas trabalhadas no mes?");
        double valorHoraTrabalhadas = entrada.nextDouble();

        double salario = (valorHora * valorHoraTrabalhadas);
        System.out.println("o seu salario e de:"+salario);

    }

}
