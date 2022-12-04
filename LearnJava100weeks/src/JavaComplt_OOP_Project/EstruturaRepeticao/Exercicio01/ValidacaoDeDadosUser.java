package JavaComplt_OOP_Project.EstruturaRepeticao;

import java.util.Scanner;

/*
3. Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';
*/
public class ValidacaoDeDadosUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean infoValida = false;
        String nomeUser;
        int idade;

        do {
            // a. Nome: maior que 3 caracteres;
            System.out.println("insira um nome?");
            nomeUser = sc.next();

            if(nomeUser.length() >= 3){
                infoValida = true;
            } else {
                System.out.println("O Nome precisa no minimo 3 caracteres");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            // b. Idade: entre 0 e 150;
            System.out.println("insira a sua idade?");
            idade = sc.nextInt();

            if (idade >= 0 && idade <= 150){
                infoValida = true;
            } else {
                System.out.println("idade precisa ser entre 0 e 150.");
            }
        } while (!infoValida);


        // c. Salário: maior que zero;
        infoValida = false;
        double salario;

        do {
            System.out.println("insira o seu salario?");
            salario = sc.nextDouble();

            if (salario > 0 ){
                infoValida = true;
            } else {
                System.out.println("salario precisa ser maior que 0.");
            }
        } while (!infoValida);

        // d. Sexo: 'f' ou 'm';
        infoValida = false;
        char sexo;

        do {
            System.out.println("insira o seu Sexo: 'f' ou 'm'?");
            sexo = sc.next().charAt(0);

            if (sexo != 'f' && sexo != 'm'){
                infoValida = true;
            } else {
                System.out.println("sexo precisa ser maior f ou m.");
            }
        } while (!infoValida);

        // e. Estado Civil: 's', 'c', 'v', 'd';
        infoValida = false;
        char estadoCivil;

        do {
            System.out.println("insira o seu estado civil: 's', 'c', 'v', 'd'?");
            estadoCivil = sc.next().charAt(0);

            if (sexo != 'f' && sexo != 'm'){
                infoValida = true;
            } else {
                System.out.println("sexo precisa ser maior f ou m.");
            }
        } while (!infoValida);
        sc.close();
    }
}