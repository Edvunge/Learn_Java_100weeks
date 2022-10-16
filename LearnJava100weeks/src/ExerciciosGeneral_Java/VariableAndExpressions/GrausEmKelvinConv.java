package ExerciciosGeneral_Java.VariableAndExpressions;
// Leia uma temperatura em graus Kelvin e apresente-a convertida em graus Celsius. A
//formula de conversao e:´ C = K − 273.15, sendo C a temperatura em Celsius e K a
//temperatura em Kelvin.
public class GrausEmKelvinConv {
    public static void main(String[] args) {
        double TempEmGrausKelvin = 1.2;
        double ConvDeTempEmGrausCelsius = TempEmGrausKelvin - 273.15;
        System.out.println("conversao de temperatura em graus kelvin: " + ConvDeTempEmGrausCelsius);
    }
}
