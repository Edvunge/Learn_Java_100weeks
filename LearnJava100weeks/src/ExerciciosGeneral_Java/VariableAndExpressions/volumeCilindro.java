package ExerciciosGeneral_Java.VariableAndExpressions;

import java.util.Scanner;

// Leia a altura e o raio de um cilindro circular e imprima o volume do cilindro.
// O volume de um cilindro circular e calculado por meio da seguinte formula: V = π ∗ raio2 ∗ altura, onde π = 3.141592.
public class volumeCilindro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double PI = 3.141592;

        System.out.println("insira a altura do cilindro:?");
        double altura = entrada.nextDouble();

        System.out.println("insira o raio de um cilindro:?");
        double raioDoCilindro = entrada.nextDouble();

        double volumeCilindro = (PI*((raioDoCilindro)*(raioDoCilindro))*altura);
        System.out.println("O volume de um cilindro circular e de:? "+volumeCilindro);
        entrada.close();
    }
}
