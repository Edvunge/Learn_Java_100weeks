package LoianeJavaBasico.PDFS_exercios.exercicio_11_12_13;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
14. João Papo-de-Pescador, homem de bem, comprou um
microcomputador para controlar o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido
pelo regulamento de pesca do estado de São Paulo (50 quilos) deve
pagar uma multa de R$ 4,00 por quilo excedente. João precisa que
você faça um programa que leia a variável peso (peso de peixes) e
verifique se há excesso. Se houver, gravar na variável excesso e na
variável multa o valor da multa que João deverá pagar. Caso contrário
mostrar tais variáveis com o conteúdo ZERO.
*/
public class CalcExcessoPeso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Random NUMaleatorio = new Random();

        double valorDaMulta;
        double excessoPeso;
        double valorMultaPorQuilo = 4.00;
        int pesoPeixe = NUMaleatorio.nextInt(30000) + 1;

        if(pesoPeixe > 50){
            excessoPeso = pesoPeixe - 50;
            valorDaMulta = excessoPeso * valorMultaPorQuilo;
            System.out.println("o Joao devera pagar a multa de: " + valorDaMulta);
        } else {
            excessoPeso = 0;
            valorDaMulta = 0;
            System.out.println("Nao tem nenhuma multa a pagar.");
        }
        input.close();
    }
}