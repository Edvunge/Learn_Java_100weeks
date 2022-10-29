package ExerciciosGeneral_Java.ComndsCondicionals;

import java.util.Scanner;

//  Calcule as ra´ızes da equac¸ao de 2 o grau. Lembrando que:
// X = (-b +/- V(BASKHARA))/2a
// onde BASKHARA = b ao quadrado - 4ac
// E ax2 + bx + c = 0 representa uma equacao de 2 o grau.
//
//A variavel a tem que ser diferente de zero. Caso seja igual, imprima a mensagem “Nao˜
//e equacao de segundo grau”.
// Se ∆ < 0, nao existe real. Imprima a mensagem  Nao existe raiz.
// Se ∆ = 0, existe uma raiz real. Imprima a raiz e a mensagem Raiz ´unica.
// Se ∆ ≥ 0, imprima as duas raızes reais.
//
public class CalcDaEquacaoDoSegundoGrau {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insira o valor de a:?");
        double valueA = input.nextDouble();

        System.out.println("insira o valor de b:?");
        double valueB = input.nextDouble();

        System.out.println("insira o valor de c:?");
        double valueC = input.nextDouble();

        // calculo de Bashkara.
        double BASKHARA = ( (valueB*valueB) - (4 * valueA * valueC) );

        if(valueA != 0 && valueA == 0){
            System.out.println("Nao e equacao de segundo grau");
        }

        // eq2
        if(BASKHARA > 0){
            System.out.println("Nao existe raiz.");
        } else if(BASKHARA == 0){
            System.out.println("Raiz Unica.");
        } else if (BASKHARA >= 0) {
            double equacaoSegundoGrauX_um = ( (-valueB - Math.sqrt(BASKHARA) ) / (2*valueA) );
            System.out.println("o X1 da equac = " + equacaoSegundoGrauX_um);

            double equacaoSegundoGrauX_dois = ( (-valueB + Math.sqrt(BASKHARA) ) / (2*valueA) );
            System.out.println("o X2 da equac = " + equacaoSegundoGrauX_dois);
        }
        input.close();
    }
}