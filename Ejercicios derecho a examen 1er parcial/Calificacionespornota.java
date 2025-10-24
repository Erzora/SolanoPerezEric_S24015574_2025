import java.util.Scanner;
class Calificacionespornota{
	public static void main (String args[]) {
		double calificacion;
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Ingresa la calificación del estudiante de 0.0 - 5.0: ");
		calificacion = sc.nextDouble();

		if (calificacion <= 1) 
		{
			System.out.println("El estudiante tuvo un promedio de: " + calificacion);
			System.out.println("Nota final: P");
		}
		else
		{
			if (calificacion >= 1.1 && calificacion <= 2)
			{
				System.out.println("El estudiante tuvo un promedio de: " + calificacion);
				System.out.println("Nota final: M");
			}
			else
			{
				if (calificacion >= 2.1 && calificacion <= 2.9)
				{
					System.out.println("El estudiante tuvo un promedio de: " + calificacion);
					System.out.println("Nota final: R");
				}
				else
				{
					if (calificacion >= 3 && calificacion <= 4)
					{
						System.out.println("El estudiante tuvo un promedio de: " + calificacion);
						System.out.println("Nota final: B");
					}
					else
					{
						if (calificacion >= 4.1 && calificacion <= 5)
						{
							System.out.println("El estudiante tuvo un promedio de: " + calificacion);
							System.out.println("Nota final: E");
						}
						else
						{
							System.out.println("Nota no válida");
						}
					}
				}
			}
		}
	}
}