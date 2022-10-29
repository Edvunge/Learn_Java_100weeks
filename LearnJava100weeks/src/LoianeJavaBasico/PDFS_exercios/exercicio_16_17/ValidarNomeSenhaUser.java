package LoianeJavaBasico.PDFS_exercios.exercicio_16_17;

import java.util.Scanner;

//  Faça um programa que leia um nome de usuário e a sua senha e não
//  aceite a senha igual ao nome do usuário, mostrando uma mensagem
//  de erro e voltando a pedir as informações.
public class ValidarNomeSenhaUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        String senha;
        do {

            System.out.println("insira o seu nome:");
            nome = input.next();

            System.out.println("insira a sua senha:");
            senha = input.next();

        } while (nome != senha);
        input.close();
    }
}