package JavaComplt_OOP_Project.EstruturaRepeticao;

import java.util.Scanner;

/*
fazer um programa que le numeros inteiros até que um zero seja lido. Ao final mostra a soma dos numeros lidos.
*/
public class ProgramOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        System.out.println("insira um numero:?");
        int num = sc.nextInt();

        while(num != 0){
            soma = soma + num;
            System.out.println("insira novamente um numero");
            num = sc.nextInt();
        }
        System.out.println("soma: " + soma);
        sc.close();
    }
}
