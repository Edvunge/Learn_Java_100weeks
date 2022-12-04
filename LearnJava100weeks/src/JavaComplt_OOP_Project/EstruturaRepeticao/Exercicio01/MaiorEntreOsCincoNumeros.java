package JavaComplt_OOP_Project.EstruturaRepeticao;

import java.util.Scanner;

// 7. Faça um programa que leia 5 números e informe o maior número.
public class MaiorEntreOsCincoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, guarda_maior, guarda_menor;
        int i;

        System.out.printf("Entre com o 1o numero inteiro: ");
        numero = sc.nextInt();

        guarda_maior=numero;
        guarda_menor=numero;

        for(i=1; i<5; i++)
        {
            System.out.printf("\nEntre com o %do numero inteiro: ",i+1);
            numero = sc.nextInt();

            if(numero>guarda_maior)
                guarda_maior=numero;
            else
            if(numero<guarda_menor)
                guarda_menor=numero;
        }


        System.out.printf("\nO menor numero entrado e: %d", guarda_menor);
        System.out.printf("\nO maior numero entrado e: %d", guarda_maior);

        sc.close();
    }
}