package JavaComplt_OOP_Project.EstruturaRepeticao;

public class Exe05TesteMesa {
    public static void main(String[] args) {
        int x = 2;
        int y = 10;

        System.out.println("ola");
        while (x < y) {
            System.out.println(x + "-" + y);
            x = x * 2;
            y = y + 1;
        }
        System.out.printf("\n%d",x);
        System.out.printf("\n%d",y);
    }
}
