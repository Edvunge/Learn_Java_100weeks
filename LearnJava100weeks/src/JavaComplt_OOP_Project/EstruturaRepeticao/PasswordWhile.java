package JavaComplt_OOP_Project.EstruturaRepeticao;

import java.util.Scanner;

/*
    Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
    incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
    impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
*/
public class PasswordWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pass = 2002;

        System.out.println("insira a senha:");
        int senha = sc.nextInt();

        while(senha != pass){
            System.out.println("Senha Incorreta, insira a senha:");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido.");
        sc.close();
    }
}
