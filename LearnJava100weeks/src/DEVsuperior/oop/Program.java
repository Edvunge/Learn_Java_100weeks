package DEVsuperior.oop;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        // declarando as variaveis do tipo funcionario
        Funcionario f1, f2;

        // instanciando(criar) objectos
        f1 = new Funcionario();
        f2 = new Funcionario();


        System.out.println("Dados do primeiro funcionario: ");
        f1.nome = input.next();
        f1.valorPorHora = input.nextDouble();
        f1.horas = input.nextInt();

        System.out.println("Dados do segundo funcionario: ");
        f2.nome = input.next();
        f2.valorPorHora = input.nextDouble();
        f2.horas = input.nextInt();

        double total = f1.total() + f2.total();
        System.out.printf("total = %.2f%n",total);
        input.close();
    }
}
