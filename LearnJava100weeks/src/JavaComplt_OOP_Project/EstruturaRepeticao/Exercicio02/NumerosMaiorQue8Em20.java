package JavaComplt_OOP_Project.EstruturaRepeticao.Exercicio02;
import java.util.Scanner;
// 11) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são maiores do que 8.
public class NumerosMaiorQue8Em20 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        int cont = 0, num = 0;

        for (int i = 1; i <= 4; i++){
            System.out.println("insira um numero:?");
            num = sc.nextInt();

            if (num > 8) {
                cont = cont + i;
            }
        }
        System.out.printf("os maiores que 8 sao: %d",cont);

     sc.close();
    }
}