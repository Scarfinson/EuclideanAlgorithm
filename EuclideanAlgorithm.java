
//@author scarfinson
import java.util.InputMismatchException;
import java.util.Scanner;

public class EuclideanAlgorithm {

    public static void main(String[] args) {
        EuclideanAlgorithm metodo = new EuclideanAlgorithm();
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Entrada: ");
            String x = metodo.obtenerFraccion(entrada.nextDouble());
            System.out.println("Salida: " + x);
        } catch (InputMismatchException e) {
            System.err.println("Ha ingresado datos no válidos. Revise de nuevo.");
        }

    }

    public String obtenerFraccion(double x) {
        double b = Math.pow(10, String.valueOf(x).length() - 1);
        double a = b * x;
        double c = obtenerMCD(b, a);
        a = a / c;
        b = b / c;
        return (int) a + "/" + (int) b;
    }

    public double obtenerMCD(double a, double b) {
        if (b == 0) {
            return a;
        } else {
            return obtenerMCD(b, a % b);
        }
    }
}
