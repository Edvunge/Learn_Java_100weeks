package JavaComplt_OOP_Project.EstruturaRepeticao.Exercicio02;

import java.util.Scanner;

// 4) Leia o nome um número do usuário um número N e escreva o nome dele na tela N vezes.
public class Ler_Nome_E_Numero_N_Vezes {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("insira o seu nome:?");
            String nomeUser = sc.next();

            System.out.println("insira um numero:?");
            int num = sc.nextInt();

            System.out.println("quantas vezes pretende imprimir na tela o nome");
            int N = sc.nextInt();

            for (int i = 1; i <= N; i++){
                System.out.println(nomeUser);
            }
            System.out.printf("o numero escolhido pelo user foi: %d",num);
            sc.close();
    }
}
