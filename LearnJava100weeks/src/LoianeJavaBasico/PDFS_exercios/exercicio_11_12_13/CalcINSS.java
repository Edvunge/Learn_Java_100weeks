package LoianeJavaBasico.PDFS_exercios.exercicio_11_12_13;

import java.util.Scanner;

/*
15. Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês, sabendo-se que são descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
programa que nos dê:
. salário bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o salário líquido.
d. calcule os descontos e o salário líquido, conforme a tabela
abaixo:
+ Salário Bruto : R$ - IR (11%) : R$ - INSS
(8%) : R$ - Sindicato ( 5%) : R$ = Salário
Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.
*/
public class CalcINSS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quanto voce ganha por hora:?");
        double salarioPorHora = input.nextDouble();

        System.out.println("Qual o numero de horas trabalhadas no mes:?");
        double horasTrabalhadasMes = input.nextDouble();

        double salarioBruto = salarioPorHora * horasTrabalhadasMes;
        double descImpostoRenda = 11;
        double descInss = 8;
        double descValorSindicato = 5;
        double discount;
        double inss;
        double impostoRenda;
        double valorSindicato;

        discount = (descImpostoRenda + descInss + descValorSindicato); // 24.00
        double salarioLiquido = salarioBruto - discount;

        double disc = ( salarioBruto * discount / 100);
        disc = salarioBruto - disc;

        inss = ( salarioBruto * discount / 100);
        inss = salarioBruto - inss;

        impostoRenda = ( salarioBruto * discount / 100);
        impostoRenda = salarioBruto - impostoRenda;

        valorSindicato = ( salarioBruto * discount / 100);
        valorSindicato = salarioBruto - valorSindicato;

        System.out.println("o valor do salario bruto e de: " + salarioBruto);
// por acabar.
        input.close();
    }
}
