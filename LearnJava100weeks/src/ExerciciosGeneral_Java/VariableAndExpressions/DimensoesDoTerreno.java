package ExerciciosGeneral_Java.VariableAndExpressions;

import java.util.Scanner;

//  Faca um programa para ler as dimensoes de um terreno (comprimento ˜ c e largura l),
//bem como o preco do metro de tela p. Imprima o custo para cercar este mesmo terreno
//com tela.
public class DimensoesDoTerreno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insira o valor do comprimento:?");
        double comprimento = input.nextDouble();

        System.out.println("insira o valor da largura:?");
        double largura = input.nextDouble();

        double DimensaoTerreno = ( comprimento * largura );
        System.out.println("o valor da dimensao do terreno: " + DimensaoTerreno);
        input.close();
    }
}
