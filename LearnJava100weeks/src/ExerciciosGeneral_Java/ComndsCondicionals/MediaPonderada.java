package ExerciciosGeneral_Java.ComndsCondicionals;

import java.util.Scanner;

//  Faca um algoritmo que calcule a media ponderada das notas de 3 provas. A primeira e ´
// a segunda prova tem peso 1 e a terceira tem peso 2. Ao final, mostrar a m ˆ edia do aluno ´
// e indicar se o aluno foi aprovado ou reprovado. A nota para aprovac¸ao deve ser igual ou ˜
// superior a 60 pontos.
public class MediaPonderada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("indique a primeira nota:?");
        double nota1 = input.nextDouble();

        System.out.println("indique a segunda nota:?");
        double nota2 = input.nextDouble();

        System.out.println("indique a terceira nota:?");
        double nota3 = input.nextDouble();

        double peso1 = 1;
        double peso2 = 1;
        double peso3 = 2;
        double mediaPonderada =( ((nota1*peso1)+(nota2*peso2)+(nota3*peso3)) / (peso1+peso2+peso3) );

        if(mediaPonderada >= 60){
            System.out.println("a media ponderada e de:" + mediaPonderada);
            System.out.println("Aluno Aprovado.");
        } else {
            System.out.println("Aluno Reprovado.");
        }
        input.close();
    }
}
