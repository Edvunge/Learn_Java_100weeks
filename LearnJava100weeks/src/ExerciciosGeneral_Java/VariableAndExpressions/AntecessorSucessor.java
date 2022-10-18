package ExerciciosGeneral_Java.VariableAndExpressions;

import java.util.Scanner;

//  Leia um numero inteiro e imprima o seu antecessor e o seu sucessor.
public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("indique um numero:?");
        int num = input.nextInt();

        int antecessor = num - 1;
        int sucessor = num + 1;
        System.out.println("antecessor do:"+num+" e "+antecessor);
        System.out.println("sucessor do:"+num+" e "+sucessor);
        input.close();
     }
}
