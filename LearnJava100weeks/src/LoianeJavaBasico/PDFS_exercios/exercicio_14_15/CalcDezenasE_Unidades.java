package LoianeJavaBasico.PDFS_exercios.exercicio_14_15;
import java.util.Scanner;
/*
19. Faça um Programa que leia um número inteiro menor que 1000 e
imprima a quantidade de centenas, dezenas e unidades do mesmo.
o Observando os termos no plural a colocação do "e", da vírgula
entre outros. Exemplo:
o 326 = 3 centenas, 2 dezenas e 6 unidades
o 12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320,
310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
*/
public class CalcDezenasE_Unidades {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf ("Escolha um numero ate 1000 \n");
        int n = sc.nextInt();

        int c = n/100;
        int d = ((n-(c*100))/10);
        int u = (n-(c*100 + d*10));

        if (n<=1000){
            System.out.printf ("%d centenas \n", c);
            System.out.printf ("%d dezenas \n", d);
            System.out.printf ("%d unidades \n", u);
        } else {
            System.out.printf ("Valor invalido");
        }

        // segunda forma de se fazer.
        /*
        System.out.println("Digite um numero inteiro positivo: ");
        int numero = sc.nextInt();

    // Extraindo a unidade
     int unidade = numero % 10;

    // Eliminando a unidade de nosso número
      numero = (numero - unidade)/10;

    // Extraindo a dezena
      int dezena = numero % 10;

    // Eliminando a dezena do número original, fica a centena
     numero = (numero - dezena)/10;
     int centena = numero;

    // Fazendo ser inteiros
     dezena = dezena;
     centena = centena;

     System.out.printf("%d centena(s) , %d dezena(s) e %d unidade(s) ",centena,dezena,unidade);*/
        sc.close();
    }
}