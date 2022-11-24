package JavaComplt_OOP_Project.EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class LeituraPeloTeclado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("digite qualquer coisa:?");
        // leitura pelo teclado: com o codigo abaixo vc poderá ler apenas um caractere.
        /*
        char x;

        x = sc.next().charAt(0);
        System.out.println("voce digitou: "+ x);
        */

        /*
        String x;
        int y;
        double z;
        x = sc.next(); // leitura de String
        y = sc.nextInt(); // leitura de int
        z = sc.nextDouble(); // leitura de double
        System.out.println("dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        */

        // para ler um texto ate a quebra de linha, digite o codigo abaixo.
        /*
        String s1,s2,s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("dados digitados: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        */

        // Quebra de linha pendente.
        int x;
        String s1,s2,s3;

        x = sc.nextInt();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("dados digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        sc.close();
    }
}
