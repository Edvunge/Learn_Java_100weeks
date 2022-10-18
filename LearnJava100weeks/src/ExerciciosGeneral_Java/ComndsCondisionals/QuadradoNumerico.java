package ExerciciosGeneral_Java.ComndsCondisionals;

import java.util.Scanner;

// Faca um programa que leia um numero e, caso ele seja positivo, calcule e mostre:
//• O numero digitado ao quadrado
//• A raiz quadrada do numero digitado
public class QuadradoNumerico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("insira um numero:?");
        int num = entrada.nextInt();

        int numAoQuadrado = ( (num) * (num) );
        double raizQuadrada = Math.sqrt(num);

        if(num>0){
            System.out.println("O numero digitado ao quadrado: " + numAoQuadrado);
            System.out.println("A raiz quadrada do numero digitado: " + raizQuadrada);
        }
        entrada.close();
    }
}
