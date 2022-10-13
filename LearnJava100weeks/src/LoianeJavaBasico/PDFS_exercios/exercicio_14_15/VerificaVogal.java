package LoianeJavaBasico.PDFS_exercios.exercicio_14_15;

import java.util.Scanner;

//  Faça um Programa que verifique se uma letra digitada é vogal ou
//consoante.
public class VerificaVogal {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.println("indique uma letra.");
        String letra = input.nextLine();
        if(letra.toUpperCase() != "a"){
            System.out.println("funciona.");
        }
        System.out.println("fim do if");
        input.close();
    }
}
