package JavaComplt_OOP_Project.EstruturaSequencial;

public class exerc01 {
    public static void main(String[] args){
        String product1 = "computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double prince1 = 2100.0;
        double prince2 = 650.50;
        double measure = 53.234567;

        System.out.printf("\nProducts:");
        System.out.printf("\n%s, which price is $ %.2f",product1,prince1);
        System.out.printf("\n%s, which price is $ %.2f\n ",product1,prince2);
        System.out.printf("\nRecord: %d years old, code %d and gender: %c\n",age,code,gender);
        System.out.printf("\nMeasue with eight decimal places: %f",measure);
        System.out.printf("\nRouded (three decimal places): %.3f",measure);
        System.out.printf("\nUS decimal point: %.2f",measure);
    }
}
