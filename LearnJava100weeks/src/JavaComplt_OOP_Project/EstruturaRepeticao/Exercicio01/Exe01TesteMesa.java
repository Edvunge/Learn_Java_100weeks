package JavaComplt_OOP_Project.EstruturaRepeticao;

public class Exe01TesteMesa {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;

        while (x > 2) {
            System.out.println(x);
            y = y + x;
            x = x - 1;
        }
        System.out.printf("\n%d",x);
        System.out.printf("\n%d",y);
    }
}
