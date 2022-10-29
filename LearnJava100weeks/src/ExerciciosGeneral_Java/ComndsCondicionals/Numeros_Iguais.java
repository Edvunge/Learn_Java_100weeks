package ExerciciosGeneral_Java.ComndsCondicionals;
//  Faca um programa que receba dois numeros e mostre o maior. Se por acaso, os dois ´
//numeros forem iguais, imprima a mensagem ´ N´umeros iguais.
public class Numeros_Iguais {
    public static void main(String[] args) {
        // int randomNum = (int)(Math.random() * 100)
        int randomNum = (int)(Math.random() * 100);
        int randomNum1 = (int)(Math.random() * 100);

        System.out.println("entre o numero:");
        System.out.println(randomNum);
        System.out.println(randomNum1);

        if(randomNum > randomNum1){
            System.out.println("O maior numero e: " + randomNum);
        } else if (randomNum1 > randomNum) {
            System.out.println("O maior numero e: " + randomNum1);
        } else if(randomNum == randomNum1){
            System.out.println("os numeros sao iguais: ");
        }
    }
}
