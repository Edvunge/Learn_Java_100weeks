package JavaComplt_OOP_Project.EstruturaRepeticao;

import java.util.Objects;
import java.util.Scanner;

/*
    2. Faça um programa que leia um nome de usuário e a sua senha e não
    aceite a senha igual ao nome do usuário, mostrando uma mensagem
    de erro e voltando a pedir as informações.
*/
public class Nome_E_Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean infoValidas = false;

        do {
            System.out.println("Entre com o nome do usuario:");
            String nomeUser = sc.next();

            System.out.println("Entre com a senha:");
            String senha = sc.next();

            if(nomeUser.equalsIgnoreCase(senha)){
                System.out.println("Senha igual a usuario, digite novamente.");
            } else {
                infoValidas = true;
                System.out.println("Senha e usuarios validos.");
            }
        } while (!infoValidas);
        sc.close();
    }
}
