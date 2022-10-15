package LoianeJavaBasico.PDFS_exercios.exercicio_14_15;

import java.util.Scanner;

//  Faça um Programa que verifique se uma letra digitada é vogal ou
//consoante.
public class VerificaVogal {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        char letra = 'o';

        switch (letra){
            case 'a':
                case 'e':
                    case 'i':
                        case 'o':
                            case 'u': System.out.println("vogal");
                break;
            case 'b': case 'c': case 'd': case 'f':
            case 'g': case 'h': case 'j': case 'l':
            case 'm': case 'n': case 'p': case 'q':
            case 'r': case 's': case 't': case 'v':
            case 'x': case 'y': case 'w': case 'z':
                System.out.println("consoante");
                break;
            default:
                System.out.println("nao e uma letra.");
        }
        input.close();
    }
}
