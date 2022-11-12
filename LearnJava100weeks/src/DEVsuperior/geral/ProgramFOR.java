package DEVsuperior.geral;
/*
fazer um programa que le um valor inteiro N
e depois N numeros inteiros. Ao final, mostra a
soma dos N numeros lidos.
*/

public class ProgramFOR {
    public static void main(String[] args) {
       int x = 4;
       int y = x + 2;
       for(int i = 0; i < x; i++){
           System.out.println(x+" "+y);
           y = y + x;
       }
        System.out.println("fim");
    }
}
