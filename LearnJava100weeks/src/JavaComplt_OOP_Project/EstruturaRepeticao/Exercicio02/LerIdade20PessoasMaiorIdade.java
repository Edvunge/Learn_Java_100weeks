package JavaComplt_OOP_Project.EstruturaRepeticao.Exercicio02;

import java.util.Scanner;

// 8) Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.
public class LerIdade20PessoasMaiorIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        int cont = 0;

        for (int i = 1; i <= 20; i++){
            System.out.println("insira a sua idade:?");
            idade = sc.nextInt();

            if(idade >= 18){
               cont = cont + 1;
            }
        }
        System.out.println("A quantidade de pessoas com idade maior a 18 anos e de " + cont);
        sc.close();
    }
}