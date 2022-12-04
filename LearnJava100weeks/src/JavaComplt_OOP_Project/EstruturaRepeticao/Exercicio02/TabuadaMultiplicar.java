package JavaComplt_OOP_Project.EstruturaRepeticao.Exercicio02;
// 10) Crie um algoritmo leia um número do usuário e exiba a sua tabuada de multiplicação.
public class TabuadaMultiplicar {
    public static void main(String[] args) {
        int multiplicacao, n = 1;
        for (int i = 1; i <= 12; i++){
            multiplicacao = i * n;
            System.out.printf("\n%d * %d = %d",i ,n ,multiplicacao);
        }
    }
}