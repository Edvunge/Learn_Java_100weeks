package ExerciciosGeneral_Java.VariableAndExpressions;
//  Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit.
//A formula de conversao e: ´ F = C∗(9.0/5.0)+32.0, sendo F a temperatura em Fahrenheit
//e C a temperatura em Celsius.
public class ConversaoFahrenheit {
    public static void main(String[] args) {
        double tempGrausCelsius = 2.1;
        double convParaFahrenheit = (tempGrausCelsius*(9.0/5.0)+32.0);
        System.out.println("valor resultante da conversao de celsius para fahrenheit: " + convParaFahrenheit);
    }
}
