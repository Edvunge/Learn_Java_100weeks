package ExerciciosGeneral_Java.VariableAndExpressions;

import java.util.Scanner;
// . Leia quatro notas, calcule a media aritm ´ etica e imprima o resultado.
public class Media_Aritmetrica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("indica a sua nota1");
        int nota1 = entrada.nextInt();

        System.out.println("indica a sua nota2");
        int nota2 = entrada.nextInt();

        System.out.println("indica a sua nota3");
        int nota3 = entrada.nextInt();

        System.out.println("indica a sua nota4");
        int nota4 = entrada.nextInt();

        int Media_Aritmentrica = (nota1+nota2+nota3+nota4)/4;
        System.out.println(" o seu ano de nascimento e: " + Media_Aritmentrica);
        entrada.close();
    }
}
