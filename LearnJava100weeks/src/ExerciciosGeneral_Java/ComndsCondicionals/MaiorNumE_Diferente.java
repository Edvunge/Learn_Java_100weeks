package ExerciciosGeneral_Java.ComndsCondicionals;
// Escreva um programa que, dados dois numeros inteiros,
// mostre na tela o maior deles, assim como a diferenca existente entre ambos.
public class MaiorNumE_Diferente {
    public static void main(String[] args) {
        int randomNum = (int)(Math.random() * 100);
        int randomNum1 = (int)(Math.random() * 100);

       int diferenca = randomNum-randomNum1;

        System.out.println("entre o numero:");
        System.out.println(randomNum);
        System.out.println(randomNum1);

       if(randomNum>randomNum1){
           System.out.println("maior numero e: " + randomNum);
       } else{
           System.out.println("diferenca existente entre ambos e de: " + diferenca);
       }
    }
}
