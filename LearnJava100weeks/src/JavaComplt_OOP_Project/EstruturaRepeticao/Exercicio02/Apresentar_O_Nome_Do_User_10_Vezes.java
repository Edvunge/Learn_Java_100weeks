package JavaComplt_OOP_Project.EstruturaRepeticao.Exercicio02;

import java.util.Scanner;

// 3) Leia o nome do usuário e escreva o nome dele na tela 10 vezes.
public class Apresentar_O_Nome_Do_User_10_Vezes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("insira o seu nome:?");
        String nomeUser = sc.next();

        for (int i = 1; i <= 10; i++){
            System.out.println(nomeUser);
        }
        sc.close();
    }
}
