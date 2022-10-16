package ExerciciosGeneral_Java.VariableAndExpressions;
// . Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius.
//A formula de convers ´ ao˜ e: ´ C = 5.0 ∗ (F − 32.0)/9.0, sendo C a temperatura em Celsius
//e F a temperatura em Fahrenheit.
public class ConversaoCelsius {
    public static void main(String[] args) {
        double tempGrausFahrenheit = 2.1;
        double convParaTempGrausCelsius = (5.0 * (tempGrausFahrenheit - 32.0)/9.0);
        System.out.println("valor resultante da conversao de fahrenheit para celsius: " + convParaTempGrausCelsius);
    }
}
