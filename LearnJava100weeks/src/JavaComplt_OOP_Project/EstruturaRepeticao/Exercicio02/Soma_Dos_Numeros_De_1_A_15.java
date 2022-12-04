package JavaComplt_OOP_Project.EstruturaRepeticao.Exercicio02;
// 2) Escreva um algoritmo que calcule a soma dos números de 1 a 15.
public class Soma_Dos_Numeros_De_1_A_15 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i < 15; i++){
            soma = soma+i;
        }
        System.out.printf("a soma e de: %d",soma);
    }
}