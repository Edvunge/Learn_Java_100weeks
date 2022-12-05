package LoianeJavaBasico.PDFS_exercios.exercicio_14_15;

import java.util.Scanner;

// . Faça um Programa que verifique se uma letra digitada é "F" ou "M".
//Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido
public class VerifiqueSexo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("indique o sexo?");
        char sexo = entrada.next().charAt(0);

        if (sexo == 'F'){
            System.out.printf("F - Feminino. \n");
        } else if (sexo == 'M') {
            System.out.printf("M - Masculino. \n");
        } else {
            System.out.println("Sexo inválido. \n");
        }
        entrada.close();
    }
}