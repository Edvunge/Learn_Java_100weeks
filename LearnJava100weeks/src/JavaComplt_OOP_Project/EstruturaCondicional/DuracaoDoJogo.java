package JavaComplt_OOP_Project.EstruturaCondicional;

import java.util.Scanner;

// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
public class DuracaoDoJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nInsira a hora inicial do jogo:?");
        int horaInicial = sc.nextInt();

        System.out.println("\nInsira a hora final do jogo:?");
        int horaFinal = sc.nextInt();

        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        sc.close();
    }
}
