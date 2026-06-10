import java.util.Scanner;

public class CalculadoraFiguras {

    public static double calcularAreaCuadrado() {
        return 0;
    }

    public static double calcularAreaRectangulo() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el ancho: ");
        double ancho = teclado.nextDouble();

        System.out.print("Ingrese el alto: ");
        double alto = teclado.nextDouble();

        double area = ancho * alto;

        System.out.println("El área del rectángulo es: " + area);

        return area;
    }

    public static double calcularAreaTriangulo() {
        return 0;
    }

    public static double calcularAreaCirculo() {
        return 0;
    }
    // Parametros: radio | Retorna: area
public static double calcularAreaCirculo(double radio) {
    return Math.PI * radio * radio;

}
