package LoianeJavaBasico.PDFS_exercios.exercicio_14_15;

import java.util.Locale;
import java.util.Scanner;

/*
12. Faça um programa para o cálculo de uma folha de pagamento,
sabendo que os descontos são do Imposto de Renda, que depende do
salário bruto (conforme tabela abaixo) e
3% para o Sindicato e
que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
a empresa que deposita).
O Salário Líquido corresponde ao SalárioBruto menos os descontos.
O programa deverá pedir ao usuário o
valor da sua hora e a quantidade de horas trabalhadas no mês.
    * Desconto do IR:
    * Salário Bruto até 900 (inclusive) - isento
    * Salário Bruto até 1500 (inclusive) - desconto de 5%
    * Salário Bruto até 2500 (inclusive) - desconto de 10%
    * Salário Bruto acima de 2500 - desconto de 20%

    Imprima na tela as informações, dispostas conforme o exemplo abaixo. No
exemplo
o valor da hora é 5
e a quantidade de hora é 220.

*/
public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double horasTrabalhadas, quantidadeHorasTrabalhadas, impostoRenda, sindicato = 3, salarioLiquido, salarioBruto;

        System.out.println("Qual e o valor da horas trabalhadas:?");
        horasTrabalhadas = sc.nextDouble();

        System.out.println("Qual e a quantidade da horas trabalhadas:?");
        quantidadeHorasTrabalhadas = sc.nextDouble();
        //impostoRenda = sindicato;

        salarioBruto = ( horasTrabalhadas * quantidadeHorasTrabalhadas );

        if ( salarioBruto <= 900 ) {
            // isento de desconto

            System.out.printf("isento de desconto");
            System.out.printf("\nO valor da hora e : %.1f \n",horasTrabalhadas);
            System.out.printf("E a quantidade de hora: %.1f \n",quantidadeHorasTrabalhadas);
        } else if ( salarioBruto <= 1500 ) {
            // calculo do desconto 5%
            double percetagem = 5.0;
            double desconto = ( salarioBruto * percetagem ) / 100;
            desconto = desconto - sindicato;
            impostoRenda = salarioBruto - desconto;

            salarioLiquido = salarioBruto - impostoRenda;

            System.out.printf("\nO valor do salario liquido e : %.2f \n",salarioLiquido);
            System.out.printf("\nO valor da hora e : %.1f \n",horasTrabalhadas);
            System.out.printf("E a quantidade de hora: %.1f \n",quantidadeHorasTrabalhadas);
        } else if ( salarioBruto <= 2500 ) {
            // calculo do desconto 10%
            double percetagem = 10.0;
            double desconto = ( salarioBruto * percetagem ) / 100;
            desconto = desconto - sindicato;
            impostoRenda = salarioBruto - desconto;

            salarioLiquido = salarioBruto - impostoRenda;

            System.out.printf("\nO valor do salario liquido e : %.2f \n",salarioLiquido);
            System.out.printf("\nO valor da hora e : %.1f \n",horasTrabalhadas);
            System.out.printf("E a quantidade de hora: %.1f \n",quantidadeHorasTrabalhadas);
        } else if ( salarioBruto >= 2500 ) {
            // calculo do desconto 20%
            double percetagem = 20.0;
            double desconto = ( salarioBruto * percetagem ) / 100;
            desconto = desconto - sindicato;
            impostoRenda = salarioBruto - desconto;

            salarioLiquido = salarioBruto - impostoRenda;

            System.out.printf("\nO valor do salario liquido e : %.2f \n",salarioLiquido);
            System.out.printf("\nO valor da hora e : %.1f \n",horasTrabalhadas);
            System.out.printf("E a quantidade de hora: %.1f \n",quantidadeHorasTrabalhadas);
        }
        sc.close();
    }
}