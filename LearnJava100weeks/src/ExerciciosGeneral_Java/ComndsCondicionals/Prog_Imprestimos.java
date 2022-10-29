package ExerciciosGeneral_Java.ComndsCondicionals;

import java.util.Scanner;

//  Leia o salario de um trabalhador e o valor da prestacao de um emprestimo. Se a ´
//  prestacao for maior que 20% do salario imprima: ´ Emprestimo nao concedido, caso
//  contrario imprima: Emprestimo concedido.
public class Prog_Imprestimos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("indique o salario do trabalhador:?");
        double salarioTrabalhador = input.nextDouble();

        System.out.println("indique o valor da prestacao do emprestimo:?");
        double valorPrestaEmprestimo = input.nextDouble();

        if(valorPrestaEmprestimo>20){
            System.out.println("Emprestimo nao concedido.");
        } else {
            System.out.println("Emprestimo concedido.");
        }
        input.close();
    }
}
