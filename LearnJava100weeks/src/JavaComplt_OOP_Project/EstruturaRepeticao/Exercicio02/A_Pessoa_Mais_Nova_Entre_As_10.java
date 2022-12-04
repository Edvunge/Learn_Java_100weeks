package JavaComplt_OOP_Project.EstruturaRepeticao.Exercicio02;

import java.util.Scanner;

// 9) Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.
public class A_Pessoa_Mais_Nova_Entre_As_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[3];
        int[] idades = new int[3];
        int idadeMaisNova = 99;
        String nomeDaPessoaMaisNova = "";

        for (int i = 0; i < 3; i++) {
            // Entrada dos dados
            System.out.println("Digite o nome: ");
            nomes[i] = sc.next();

            System.out.println("Digite a idade:");
            idades[i] = sc.nextInt();

            // Extraindo os idades e nomes do maior e menor idade
            if (idades[i] < idadeMaisNova) {
                idadeMaisNova = idades[i];
                nomeDaPessoaMaisNova = nomes[i];
            }
        }

        System.out.println("Pessoa Mais nova Nome: " + nomeDaPessoaMaisNova);
        System.out.println("Pessoa Mais nova Idade: " + idadeMaisNova);
        sc.close();
    }
}