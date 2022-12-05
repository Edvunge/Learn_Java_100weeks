package LoianeJavaBasico.PDFS_exercios.exercicio_14_15;
import java.util.Scanner;
/*
18. Faça um Programa que peça uma data no formato dd/mm/aaaa e
determine se a mesma é uma data válida.
*/
public class DataValida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("insira a data/mes/ano");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int ano = sc.nextInt();

        if( ( dia <= 0 || dia >= 32 ) || ( mes <= 0 || mes >= 13 ) || ( ano <= 0 ) ){
            System.out.println("Formato de data Invalido.");
        } else {
            switch(mes){
                case 1:
                    System.out.printf("%d/janeiro/%d",dia,ano);
                    break;
                case 2:
                    System.out.printf("%d/feveiro/%d",dia,ano);
                    break;
                case 3:
                    System.out.printf("%d/marco/%d",dia,ano);
                    break;
                case 4:
                    System.out.printf("%d/abril/%d",dia,ano);
                    break;
                case 5:
                    System.out.printf("%d/maio/%d",dia,ano);
                    break;
                case 6:
                    System.out.printf("%d/junho/%d",dia,ano);
                    break;
                case 7:
                    System.out.printf("%d/julho/%d",dia,ano);
                    break;
                case 8:
                    System.out.printf("%d/agosto/%d",dia,ano);
                    break;
                case 9:
                    System.out.printf("%d/setembro/%d",dia,ano);
                    break;
                case 10:
                    System.out.printf("%d/outubro/%d",dia,ano);
                    break;
                case 11:
                    System.out.printf("%d/novembro/%d",dia,ano);
                    break;
                case 12:
                    System.out.printf("%d/dezembro/%d",dia,ano);
                    break;
                default:
                    System.out.printf("\nNumero Invalido.");
            }
        }
        sc.close();
    }
}