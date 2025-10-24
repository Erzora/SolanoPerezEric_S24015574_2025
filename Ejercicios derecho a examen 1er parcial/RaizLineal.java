import java.util.Scanner;
public class RaizLineal {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
        	double a, b, c, discriminante, x1, x2, raizlineal;
		System.out.println("--- Calculadora de Raíces de Ecuación Cuadrática (A*X^2 + B*X + C = 0) ---");
		System.out.print("Ingrese el coeficiente A: ");
		a = scanner.nextDouble();
		System.out.print("Ingrese el coeficiente B: ");
		b = scanner.nextDouble();
		System.out.print("Ingrese el coeficiente C: ");
		c = scanner.nextDouble();
		System.out.println("--- Análisis de la Ecuación ---");
			if (a == 0) {
				System.out.println("El coeficiente A es cero. La ecuación no es de segundo grado (cuadrática), es una ecuación lineal.");
			if (b != 0) {
 				raizlineal = -c / b;
				System.out.printf("  Se resuelve como ecuación lineal: X = %.4f\n", raizlineal);
			} else if (c == 0) {
				System.out.println("  La ecuación es 0 = 0. Infinitas soluciones.");
			} else {
				System.out.println("  La ecuación es una contradicción (ej: 5 = 0). Sin solución.");
			}
			} else {
				discriminante = (b * b) - (4 * a * c);
				System.out.printf("Coeficientes: A=%.2f, B=%.2f, C=%.2f\n", a, b, c);
				System.out.printf("Discriminante (b^2 - 4ac): %.4f\n", discriminante);
			if (discriminante < 0) {
				System.out.println("El discriminante es negativo.");
				System.out.println("La ecuación tiene raíces imaginarias (no reales).");
			} else if (discriminante == 0) {
				x1 = -b / (2 * a);
				x2 = x1; 
				System.out.println("\nResultado: Raíz real única (o dos raíces iguales).");
				System.out.printf("X1 = X2 = %.4f\n", x1);
			} else { 
				x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
				x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
				System.out.println("El resultado de dos raíces reales distintas.");
				System.out.printf("Raíz X1 = %.4f\n", x1);
				System.out.printf("Raíz X2 = %.4f\n", x2);
			}
		}

	sc.close();
	}
}