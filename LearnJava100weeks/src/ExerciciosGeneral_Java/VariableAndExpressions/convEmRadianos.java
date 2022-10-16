package ExerciciosGeneral_Java.VariableAndExpressions;
// Leia um angulo em graus e apresente-o convertido em radianos. A f ˆ ormula de convers ´ ao˜
//e: ´ R = G ∗ π/180, sendo G o angulo em graus e ˆ R em radianos e π = 3.14.
public class convEmRadianos {
    public static void main(String[] args) {
        float anguloEmGraus = 3.2f;
        final double PI = 3.14;
        double convRadianos = (anguloEmGraus * (PI/180));
        System.out.println(" valor da conversao em radianos: " + convRadianos);
    }
}
