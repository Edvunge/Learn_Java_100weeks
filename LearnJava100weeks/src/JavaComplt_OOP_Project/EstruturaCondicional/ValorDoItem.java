package JavaComplt_OOP_Project.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
A seguir, calcule e mostre o valor da conta a pagar.

1 Cachorro Quente  R$ 4.00
2 X-Salada  R$ 4.50
3 X-Bacon  R$ 5.00
4 Torrada Simples  R$ 2.00
5 Refrigerante  R$ 1.50

	escolha o codigo: 2
	escolha a quantidade: 3

  	total = preço X quantidade
	total = 16,8
*/
public class ValorDoItem {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorProduto, total;

        System.out.println("\nInsira o codigo do produto:?\n");
        System.out.println("1 Cachorro Quente  R$ 4.00");
        System.out.println("2 X-Salada  R$ 4.50");
        System.out.println("3 X-Bacon  R$ 5.00");
        System.out.println("4 Torrada Simples  R$ 2.00");
        System.out.println("5 Refrigerante  R$ 1.50");
        int codigoProduto = sc.nextInt();

        System.out.println("\nInsira a quantidade:?");
        int quantidadeProduto = sc.nextInt();

        if ( codigoProduto == 1 ) {
            valorProduto = 4.00;
            total = ( valorProduto * quantidadeProduto );
            System.out.printf("\nO valor total e de: %.2f",total);
        } else if (codigoProduto == 2) {
            valorProduto = 4.50;
            total = ( valorProduto * quantidadeProduto );
            System.out.printf("\nO valor total e de: %.2f",total);
        } else if (codigoProduto == 3) {
            valorProduto = 5.00;
            total = ( valorProduto * quantidadeProduto );
            System.out.printf("\nO valor total e de: %.2f",total);
        } else if (codigoProduto == 4) {
            valorProduto = 2.00;
            total = ( valorProduto * quantidadeProduto );
            System.out.printf("\nO valor total e de: %.2f",total);
        } else if (codigoProduto == 5) {
            valorProduto = 1.50;
            total = ( valorProduto * quantidadeProduto );
            System.out.printf("\nO valor total e de: %.2f",total);
        }
        sc.close();
    }
}
