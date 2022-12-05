package LoianeJavaBasico.PDFS_exercios.exercicio_14_15;

import java.util.Scanner;

import static java.lang.Math.sqrt;

/*
16. Faça um programa que calcule as raízes de uma equação do segundo
grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a,
b e c e fazer as consistências, informando ao usuário nas seguintes
situações:
a. Se o usuário informar o valor de A igual a zero, a equação não é
do segundo grau e o programa não deve fazer pedir os demais
valores, sendo encerrado;
b. Se o delta calculado for negativo, a equação não possui raizes
reais. Informe ao usuário e encerre o programa;
c. Se o delta calculado for igual a zero a equação possui apenas
uma raiz real; informe-a ao usuário;
d. Se o delta for positivo, a equação possui duas raiz reais;
informe-as ao usuário;
*/
public class CalcDasRaizesDaEquacaoDoSegundoGrau {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        double delta, num, xisUm, xisDois, b = 0, c = 0, a = 0;

        System.out.printf("Insira um para a numero:?");
        a = sc.nextDouble();

        System.out.printf("Insira um para b numero:?");
        b = sc.nextDouble();

        System.out.printf("Insira um para c numero:?");
        c = sc.nextDouble();

        // calculo de delta
        delta = ( ( b * b ) - ( 4 * a * c ) );

        if( a == 0 ) {
            System.out.printf("A equacao nao possui raizes reais ");
        } else {
            if ( delta >= 0 ) {
                // calculo de baskhara
                xisUm = ( ( ( - b ) + sqrt(delta) ) / ( (2) * (a) ) );
                xisDois = ( ( ( - b ) - sqrt(delta) ) / ( (2) * (a) ) );
                System.out.printf("Assim, as raizes da equacao %f x2 %f x %f = 0 sao x1 = %f e x2 = %f",a,b,c,xisUm,xisDois);
            } else if ( delta < 0 ) {
                System.out.printf("\nNao existe raiz.");
            } else if( delta == 0 ) {
                System.out.printf("Raiz Unica.");
            }
        }
        sc.close();
    }
}