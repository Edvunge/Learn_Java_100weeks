package LoianeJavaBasico.PDFS_exercios.exercicio_14_15;

import java.util.Locale;
import java.util.Scanner;

/*
26. Um posto está vendendo combustíveis com a seguinte tabela de
descontos:
. Álcool:
a. até 20 litros, desconto de 3% por litro
b. acima de 20 litros, desconto de 5% por litro

Gasolina:
c. até 20 litros, desconto de 4% por litro
d. acima de 20 litros, desconto de 6% por litro

Escreva um algoritmo que leia o número de litros vendidos, o tipo de
combustível (codificado da seguinte forma: A-álcool, G-gasolina),
calcule e imprima o valor a ser pago pelo cliente

sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço
do litro do álcool é R$ 1,90.
*/
public class VendendoCombustiveis {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double valorPorLitroGasolina = 2.50, valorPorLitroAlcool = 1.90, litroGasolina = 0, litroAlcool = 0, desconto;

        System.out.println("Escolha uma opcao de compra:  A-alcool, G-gasolina ");
        char opcao = sc.next().charAt(0);

        if(opcao == 'a'){
            System.out.println("Bemvindo A Compra De Alcool.");
            System.out.println("quantos litros de alcool vai comprar:?");
            litroAlcool = sc.nextDouble();

            if (litroAlcool <= 20) {
                // calculo de desconto 3%
                double percetagem = 3.0;
                desconto = (valorPorLitroAlcool * percetagem) / 100;
                double litro_Alcool_Aplicado_Desconto = (litroAlcool * valorPorLitroAlcool);
                litro_Alcool_Aplicado_Desconto = litro_Alcool_Aplicado_Desconto - desconto;

                System.out.printf("O valor a pagar e de: R$ %.3f \n",litro_Alcool_Aplicado_Desconto);
            } else if(litroAlcool > 20){
                // calculo de desconto 5%
                double percetagem = 5.0;
                desconto = (valorPorLitroAlcool * percetagem) / 100;
                double litro_Alcool_Aplicado_Desconto = (litroAlcool * valorPorLitroAlcool);
                litro_Alcool_Aplicado_Desconto = litro_Alcool_Aplicado_Desconto - desconto;

                System.out.printf("O valor a pagar e de: R$ %.3f \n",litro_Alcool_Aplicado_Desconto);
            }
        }else if (opcao == 'g'){
            System.out.println("Bemvindo A Compra De Gasolina.");
            System.out.println("quantos litros de gasolina vai comprar:?");
            litroGasolina = sc.nextDouble();

            if (litroGasolina <= 20) {
                // calculo de desconto 4%
                double percetagem = 4.0;
                desconto = (valorPorLitroGasolina * percetagem) / 100;
                double litro_Gasolina_Aplicado_Desconto = (litroGasolina * valorPorLitroGasolina);
                litro_Gasolina_Aplicado_Desconto = litro_Gasolina_Aplicado_Desconto - desconto;

                System.out.printf("O valor a pagar e de: R$ %.3f \n",litro_Gasolina_Aplicado_Desconto);
            } else if(litroGasolina > 20){
                // calculo de desconto 6%
                double percetagem = 6.0;
                desconto = (valorPorLitroGasolina * percetagem) / 100;
                double litro_Gasolina_Aplicado_Desconto = (litroGasolina * valorPorLitroGasolina);
                litro_Gasolina_Aplicado_Desconto = litro_Gasolina_Aplicado_Desconto - desconto;

                System.out.printf("O valor a pagar e de: R$ %.3f \n",litro_Gasolina_Aplicado_Desconto);
            }
        }
        sc.close();
    }
}