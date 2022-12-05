package LoianeJavaBasico.PDFS_exercios.exercicio_14_15;
import java.util.Scanner;
// Faça um Programa que pergunte em que turno você estuda. Peça
// para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
// mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
// Inválido!", conforme o caso
public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("indique em que turno vc estuda?");
        String turno = input.nextLine();

        switch(turno.toUpperCase()){
            case "M":
                System.out.println("Bom Dia!.");
                break;
            case "V":
                System.out.println("Boa Tarde!.");
                break;
            case "N":
                System.out.println("Boa Noite!.");
                break;
            default:
                System.out.println("Inválido!.");
        }
        input.close();
    }
}