import java.util.Scanner;

public class Porcentajep {
	public static void main(String args[]) {
	double porcentajeHombres, porcentajeMujeres;
	int totalEstudiantes, hombres, mujeres;
	Scanner sc = new Scanner(System.in);

	System.out.println("Ingresar cantidad de hombres: ");
	hombres = sc.nextInt();
	System.out.println("Ingresar cantidad de mujeres: ");
	mujeres = sc.nextInt();
	
	totalEstudiantes = hombres + mujeres;
	porcentajeHombres = (hombres * 100)/totalEstudiantes;
	porcentajeMujeres = (mujeres * 100)/totalEstudiantes;

	System.out.println("Porcentaje de hombres: " + porcentajeHombres);
	System.out.println("Porcentaje de mujeres: " + porcentajeMujeres);

        sc.close();
    }
}