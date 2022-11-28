package JavaComplt_OOP_Project.EstruturaRepeticao;

public class Exe03TesteMesa {
    public static void main(String[] args) {
        int x = 100;
        int y = 100;

        while (x != y) {
            System.out.println("olha");
            x = (int) Math.sqrt(y);
        }
        System.out.printf("\n%d",x);
        System.out.printf("\n%d",y);
    }
}
