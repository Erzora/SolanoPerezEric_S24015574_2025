import java.util.Scanner;
public class Salarios {
	public static void main(String args[]) {
		double salarioanterior, incremento, nuevosalario;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el salario anterior del obrero: $");
		salarioanterior = scanner.nextDouble();
		incremento = salarioanterior * 0.25;
		nuevosalario = salarioanterior + incremento;

		System.out.printf("Incremento aplicado: $%.2f\n", incremento);
		System.out.printf("Nuevo salario del obrero: $%.2f\n", nuevosalario);

        scanner.close();
    }
}