package ExerciciosGeneral_Java.ComndsCondisionals;

import java.util.Scanner;

// Ler um numero inteiro. Se o numero lido for negativo, escreva a mensagem “Numero
// invalido”. Se o numero for positivo, calcular o logaritmo deste numero.
public class NumPositivoOUnegativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("indique um numero inteiro:?");
        int num = input.nextInt();

        if(num < 0 ){
            System.out.println("numero invalido.");
        } else {
            System.out.println(Math.log(num));
        }
        input.close();
    }
}
