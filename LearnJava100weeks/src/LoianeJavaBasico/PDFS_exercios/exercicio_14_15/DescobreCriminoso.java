package LoianeJavaBasico.PDFS_exercios.exercicio_14_15;

import java.util.Scanner;

// 25.Faça um programa que faça 5 perguntas para uma pessoa sobre um
//crime. As perguntas são:
//. "Telefonou para a vítima?"
//a. "Esteve no local do crime?"
//b. "Mora perto da vítima?"
//c. "Devia para a vítima?"
//d. "Já trabalhou com a vítima?" O programa deve no final emitir
//uma classificação sobre a participação da pessoa no crime. Se
//a pessoa responder positivamente a 2 questões ela deve ser
//classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
//como "Assassino". Caso contrário, ele será classificado como
//"Inocente".
public class DescobreCriminoso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Responda com Y(SIM) e N(NAO) as seguintes perguntas:\n");
        System.out.println("Telefonou para a vítima?");
        String pergunta1 = input.nextLine();

        System.out.println("Esteve no local do crime?\n");
        String pergunta2 = input.nextLine();

        System.out.println("Mora perto da vítima?");
        String pergunta3 = input.nextLine();

        System.out.println("Devia para a vítima?");
        String pergunta4 = input.nextLine();

        System.out.println("Já trabalhou com a vítima?");
        String pergunta5 = input.nextLine();

        //if(){
            System.out.println("entrou no if");
       // }

        input.close();
    }
}
