package ExerciciosGeneral_Java.ComndsCondicionals;

import java.util.Scanner;

//  Leia um numero real. Se o numero for positivo imprima a raiz quadrada.
//  Do contrario, imprima o numero ao quadrado.
public class NumQuadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("indique um numero:?");
        double numReal = input.nextInt();

        if(numReal > 0){
            System.out.println("o resultado do numero ao quadrado: "+ Math.sqrt(numReal));
        } else {
            System.out.println("O numero ao quadrado: " + ((numReal)*(numReal)));
        }
        input.close();
    }
}
