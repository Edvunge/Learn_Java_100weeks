package JavaComplt_OOP_Project.EstruturaRepeticao;
/*
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.
*/
import java.util.Scanner;

public class Numeros_Impares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insira um numero: de 1 a 1000");
        int x = input.nextInt();

        if ((x >= 1) && (x <= 1000)) {
            for (int j = 1; j <= x; j++) {
                if (  !(j % 2 == 0) ) {
                    System.out.println(j);
                }
            }
        } else {
            System.out.println("valor fora dos parametros definido.");
        }
        input.close();
    }
}