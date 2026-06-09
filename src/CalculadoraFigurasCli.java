import java.util.Scanner;


public class CalculadoraFigurasCli {
    public static void inicializar () {

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
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    return;
            }
        }
    }
}
