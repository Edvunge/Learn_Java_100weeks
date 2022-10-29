package LoianeJavaBasico;

public class LoopWhile {
    public static void main (String[] args){
        int count = 1;
        int max = 10;

        /*System.out.println("constando ate " + max);
        while (count <= max ){
            System.out.println("valor de count: " + count);
            count++;
        }*/

        do {
            count++;
            System.out.println("valor de count: " + count);
        } while (count < 100);

        System.out.println(count);
    }
}
