package JavaComplt_OOP_Project.EstruturaRepeticao;
/*
Ler um número inteiro N e calcular todos os seus divisores.
*/
import java.util.Scanner;

public class DivisorDeUmNumeroQualquer {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Escreva um número");
        int y = x.nextInt();
        for(int i = y; i>0;i--){
            if(y % i == 0){
                System.out.println(i);
            }
        }
    }
}
