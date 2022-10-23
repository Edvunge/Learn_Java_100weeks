package ExerciciosGeneral_Java.ComndsCondisionals;

import java.util.Scanner;

// Dados tres valores,  A, B, C, verificar se eles podem ser valores dos lados de um triangulo ˆ
//e, se forem, se e um triangulo escaleno, equilatero ou isoscele, considerando os seguintes conceitos:
//  O comprimento de cada lado de um triangulo e menor do que a soma dos outros dois lados.
//  Chama-se equilatero o triangulo que tem tres lados iguais.
//  Denominam-se isosceles o triangulo que tem o comprimento de dois lados iguais.
//  Recebe o nome de escaleno o triangulo que tem os tres lados diferentes.
public class CalcTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insira um lado para o triangulo:?");
        double ladoA = input.nextDouble();

        System.out.println("insira um lado para o triangulo:?");
        double ladoB = input.nextDouble();

        System.out.println("insira um lado para o triangulo:?");
        double ladoC = input.nextDouble();

        if((ladoA == ladoB) && (ladoA == ladoC) && (ladoB == ladoC)){
            System.out.println("e um triangulo EQUILATERO.");
        } else if(ladoA == ladoB){
            System.out.println("e um triangulo ISOSCELES.");
        } else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
            System.out.println("e um ESCALENO.");
        }
        input.close();
    }
}
