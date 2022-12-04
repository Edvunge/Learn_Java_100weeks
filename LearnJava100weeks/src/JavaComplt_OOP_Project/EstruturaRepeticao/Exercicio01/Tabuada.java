package JavaComplt_OOP_Project.EstruturaRepeticao;

import java.util.Scanner;

/*
12. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
numero ele deseja ver a tabuada. A saída deve ser conforme o
exemplo abaixo:
o Tabuada de
*/
public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mulp, n = 1;

        for (int i = n; i <= 10; i++) {
            mulp = i * n;
            System.out.printf("\n%d * %d = %d",i ,n ,mulp);
        }
        sc.close();
    }
}
