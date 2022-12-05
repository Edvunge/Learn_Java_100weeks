package LoianeJavaBasico.PDFS_exercios.exercicio_14_15;
import java.util.Scanner;
//  Faça um Programa que leia três números e mostre-os em ordem
//decrescente.
public class OrdemDecrescente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("indique um numero?");
        int num = input.nextInt();

        System.out.println("indique um segundo numero?");
        int num1 = input.nextInt();

        System.out.println("indique um outro numero?");
        int num2 = input.nextInt();

            if( ((num2 > num1) && (num2 > num)) && (num1 > num)  ){
                System.out.printf(num2 + " ");
                System.out.printf(num1 + " ");
                System.out.printf(num + " ");
            } else {
                System.out.printf(num2 + " ");
                System.out.printf(num + " ");
                System.out.printf(num1 + " ");
            }


            if( ((num1 > num) && (num1 > num2)) && (num > num2)  ){
                System.out.printf(num1 + " ");
                System.out.printf(num + " ");
                System.out.printf(num2 + " ");
            } else {
                System.out.printf(num1 + " ");
                System.out.printf(num2 + " ");
                System.out.printf(num + " ");
            }


            if( ((num > num1) && (num > num2)) && (num2 > num1)  ){
                System.out.printf(num + " ");
                System.out.printf(num2 + " ");
                System.out.printf(num1 + " ");
            } else {
                System.out.printf(num + " ");
                System.out.printf(num1 + " ");
                System.out.printf(num2 + " ");
            }
        input.close();
    }
}