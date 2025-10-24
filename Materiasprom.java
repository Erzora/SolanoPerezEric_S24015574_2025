import java.util.Scanner;

public class Materiasprom {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double materia1, materia2, materia3, promedio;

		System.out.println("=== Promedio Materias ===");
		System.out.print("Ingrese la calificación de la primera materia: ");
		materia1 = sc.nextDouble();

		System.out.print("Ingrese la calificación de la segunda materia: ");
		materia2 = sc.nextDouble();

		System.out.print("Ingrese la calificación de la tercera materia: ");
		materia3 = sc.nextDouble();

		promedio = (materia1 + materia2 + materia3) / 3;

		System.out.println("\nEl promedio general de las tres materias es: " + promedio);

		if (promedio >= 6)
		{
			System.out.println("Aprobatoria.");
		}
		else
		{
			System.out.println("Reprobatoria.");
        	}

        	sc.close();
    }
}