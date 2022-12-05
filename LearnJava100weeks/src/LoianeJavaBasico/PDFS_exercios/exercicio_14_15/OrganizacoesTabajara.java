package LoianeJavaBasico.PDFS_exercios.exercicio_14_15;

import java.util.Locale;
import java.util.Scanner;

/*
11. As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contraram para desenvolver o programa que
calculará os reajustes.
    * Faça um programa que recebe o salário de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:
    * salários até R$ 280,00 (incluindo) : aumento de 20%
    * salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
    * salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
    * salários de R$ 1500,00 em diante : aumento de 5% Após o
aumento ser realizado,

informe na tela:
    * o salário antes do reajuste;
    * o percentual de aumento aplicado;
    * o valor do aumento;
    * o novo salário, após o aumento.
*/
public class OrganizacoesTabajara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double salario, aumento;

        System.out.println("qual e o seu salario:?");
        salario = sc.nextDouble();

        if ( salario <= 280.00 ) {
            // calculo do aumento 20%
            double percetagem = 20.0;
            aumento = (salario * percetagem) / 100;
            double salarioReajustado = salario + aumento;

            System.out.printf("\nO salario antes do reajuste e : %.2f \n",salario);
            System.out.printf("O percentual de aumento aplicado: %.1f \n",percetagem);
            System.out.printf("O valor do aumento: %.2f \n",aumento);
            System.out.printf("O novo salario, apos o aumento: %.2f \n",salarioReajustado);
        } else if ( salario >= 280.00 && salario < 700.00 ) {
            // calculo do aumento 15%
            double percetagem = 15.0;
            aumento = (salario * percetagem) / 100;
            double salarioReajustado = salario + aumento;

            System.out.printf("\nO salario antes do reajuste e : %.2f \n",salario);
            System.out.printf("O percentual de aumento aplicado: %.1f \n",percetagem);
            System.out.printf("O valor do aumento: %.2f \n",aumento);
            System.out.printf("O novo salario, apos o aumento: %.2f \n",salarioReajustado);
        } else if ( salario >= 700.00 && salario < 1500.00 ) {
            // calculo do aumento 10%
            double percetagem = 10.0;
            aumento = (salario * percetagem) / 100;
            double salarioReajustado = salario + aumento;

            System.out.printf("\nO salario antes do reajuste e : %.2f \n",salario);
            System.out.printf("O percentual de aumento aplicado: %.1f \n",percetagem);
            System.out.printf("O valor do aumento: %.2f \n",aumento);
            System.out.printf("O novo salario, apos o aumento: %.2f \n",salarioReajustado);
        } else if ( salario >= 1500.00 ) {
            // calculo do aumento 5%
            double percetagem = 5.0;
            aumento = (salario * percetagem) / 100;
            double salarioReajustado = salario + aumento;

            System.out.printf("\nO salario antes do reajuste e : %.2f \n",salario);
            System.out.printf("O percentual de aumento aplicado: %.1f \n",percetagem);
            System.out.printf("O valor do aumento: %.2f \n",aumento);
            System.out.printf("O novo salario, apos o aumento: %.2f \n",salarioReajustado);
        }
        sc.close();
    }
}