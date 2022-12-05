package LoianeJavaBasico.PDFS_exercios.exercicio_14_15;
import java.util.Scanner;
//  Faça um programa para a leitura de duas notas parciais de um aluno.
//O programa deve calcular a média alcançada por aluno e apresentar:
//o A mensagem "Aprovado", se a média alcançada for maior ou
//igual a sete;
//o A mensagem "Reprovado", se a média for menor do que sete;
//o A mensagem "Aprovado com Distinção", se a média for igual a
//dez.
public class MediaAluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite o valor da primeira nota?");
        double nota1 = entrada.nextDouble();

        System.out.println("digite o valor da segunda nota?");
        double nota2 = entrada.nextDouble();

        double CalcMedia = ( ( nota1 + nota2 ) / 2 );
        if (CalcMedia >= 7 && CalcMedia < 9) {
            System.out.println("Aluno Aprovado.");
        } else if (CalcMedia < 7) {
            System.out.println("Aluno Reprovado.");
        } else if (CalcMedia >= 10){
            System.out.println("Aprovado com Distincao.");
        }
        entrada.close();
    }
}