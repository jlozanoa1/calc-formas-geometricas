import java.util.Scanner;

public class CalculadoraFigurasCli {
    public static void inicializar() {

        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("=== Calculadora de Figuras Geométricas ===");
            System.out.println("1. Área de cuadrado.");
            System.out.println("2. Área de rectángulo.");
            System.out.println("3. Área de triángulo.");
            System.out.println("4. Área de círculo.");
            System.out.println("5. Salir.");
            System.out.printf("%nSeleccione una opción: ");

            int opcionUsuario = teclado.nextInt();

            switch (opcionUsuario) {
                case 1:
                    System.out.print("Ingrese el valor del lado del cuadrado: ");
                    double lado = teclado.nextDouble();
                    double areaCuadrado = CalculadoraFiguras.calcularAreaCuadrado(lado);
                    System.out.printf("El área del cuadrado es: %.2f%n%n", areaCuadrado);
                    break;
                case 2:
                    CalculadoraFiguras.calcularAreaRectangulo();
                    break;
                case 3:
                    System.out.print("Ingrese el valor de la base: ");
                    double base = teclado.nextDouble();

                    System.out.print("Ingrese el valor de la altura: ");
                    double altura = teclado.nextDouble();

                    double area = CalculadoraFiguras.calcularAreaTriangulo(base, altura);

                    System.out.printf("El área del triángulo es: %.2f%n%n", area);
                    break;
                case 4:
                    break;
                case 5:
                    return;
            }
        }
    }
}
