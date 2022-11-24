package JavaComplt_OOP_Project.EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
*/
public class CalcSalarioFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("insira o seu numero de um funcionario:?");
        int numFuncionario = sc.nextInt();

        System.out.println("insira o seu numero de horas trabalhadas:?");
        double numHorasTrabalhadas = sc.nextDouble();

        System.out.println("insira o valor que recebe por hora:?");
        double valorHorasTrabalhadas = sc.nextDouble();

        double salarioFuncionario = ( numHorasTrabalhadas * valorHorasTrabalhadas );

        System.out.printf("\nO numero de funcionario: %d \n e o salario do funcionario e de: %.2f",numFuncionario,salarioFuncionario);
        sc.close();
    }
}
