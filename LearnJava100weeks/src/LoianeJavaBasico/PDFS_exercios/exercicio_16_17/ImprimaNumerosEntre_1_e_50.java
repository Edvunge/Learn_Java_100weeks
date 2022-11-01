package LoianeJavaBasico.PDFS_exercios.exercicio_16_17;
// Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
public class ImprimaNumerosEntre_1_e_50 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 50){
            if( i % 2 != 0 ){
                System.out.println(i);
            }
            i++;
        }

        /*if( !(2 % i == 0) ){
            System.out.println("par");
        } else {
            System.out.println("entrou no else.");
        }*/
    }
}
