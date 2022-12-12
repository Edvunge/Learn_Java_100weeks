package JavaComplt_OOP_Project.introducaoProgramacaoOrientadaObjetos.application;
import JavaComplt_OOP_Project.introducaoProgramacaoOrientadaObjetos.enteties.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class ProgramRectangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("insira o valor da largura: ?");
        rectangle.width  = sc.nextByte();

        System.out.println("insira o valor da altura: ?");
        rectangle.height = sc.nextByte();

        double areaR = rectangle.Area();
        double perimeterR = rectangle.Perimeter();
        double diagonalD = rectangle.Diagonal();

        System.out.printf(" a area = %.2f ",areaR);
        System.out.printf("\n o perimetro = %.2f ",perimeterR);
        System.out.printf("\n a diagonal = %.2f ",diagonalD);
        sc.close();
    }
}