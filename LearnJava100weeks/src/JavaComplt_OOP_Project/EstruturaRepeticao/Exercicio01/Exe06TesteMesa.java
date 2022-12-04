package JavaComplt_OOP_Project.EstruturaRepeticao;

public class Exe06TesteMesa {
    public static void main(String[] args) {
        int x = 4;
        int y = 0;
        int i = 0;

        while (i < x) {
            i = i + 1;
            y = y + i;
            System.out.println(y + "-" + i);
        }
        System.out.printf("\n%d",x);
        System.out.printf("\n%d",y);
    }
}
