package ExerciciosGeneral_Java.VariableAndExpressions;
//  Leia uma velocidade em km/h (quilometros por hora) e apresente-a convertida em m/s ˆ
//(metros por segundo). A formula de convers ´ ao˜ e: ´ M = K/3.6, sendo K a velocidade em
//km/h e M em m/s.
public class ConvKiloMetroPorHoras {
    public static void main(String[] args) {
        double kmPorHora = 45.6;
        double convMetrosSegundos = (kmPorHora/3.6);
        System.out.println("valor convertido em metros por segundos: " + convMetrosSegundos);
    }
}
