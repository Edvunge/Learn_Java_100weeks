package ExerciciosGeneral_Java.ComndsCondisionals;

import java.util.Scanner;

// Leia um numero fornecido pelo usuario. Se esse numero for positivo, calcule a raiz ´
//quadrada do numero. Se o numero for negativo, mostre uma mensagem dizendo que o ´
//numero ´ e invalido.
public class CalcNumerico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("indique um numero:?");
        int num = input.nextInt();

        if(num > 0){
            System.out.println("o resultado do numero ao quadrado: "+ Math.sqrt(num));
        } else {
            System.out.println("O numero e Invalido.");
        }
        input.close();
    }
}
