package ExerciciosGeneral_Java.VariableAndExpressions;
// Leia uma temperatura em graus Celsius e apresente-a convertida em graus Kelvin. A
//formula de convers ´ ao˜ e:´ K = C + 273.15, sendo C a temperatura em Celsius e K a
//temperatura em Kelvin.
public class GrausEmCelsiusConv {
    public static void main(String[] args) {
        double TempEmGrausKelvin = 1.2;
        double ConvDeTempEmGrausCelsius = TempEmGrausKelvin - 273.15;
        System.out.println("conversao de temperatura em graus Celsius: " + ConvDeTempEmGrausCelsius);
    }
}
